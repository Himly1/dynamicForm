package himly.dynamicform.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import himly.dynamicform.service.MarkDownTranslator;
import himly.dynamicform.util.JacksonUtil;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.heading.Heading;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author himly z1399956473@gmail.com
 */
@Service
public class MarkDownTranslatorImpl implements MarkDownTranslator {

    private final Set<String> customTypes = new HashSet<>(3);

    private final Set<String> enumTypes = new HashSet<>(3);

    public MarkDownTranslatorImpl() {
        customTypes.add("Custom");
        customTypes.add("Set<Custom>");
        customTypes.add("List<Custom>");

        enumTypes.add("Enum");
        enumTypes.add("Set<Enum>");
        enumTypes.add("List<Enum>");
    }

    @Override
    public String transformToTable(String formJson, String tableName) {
        StringBuilder context = new StringBuilder();
        StringBuilder models = new StringBuilder();
        StringBuilder enums = new StringBuilder();

        context.append(System.getProperty("line.separator"));
        context.append(new Heading(tableName, 2));

        JsonNode node = JacksonUtil.toNode(formJson);
        Iterator<JsonNode> nodeIterator = node.iterator();

        Table.Builder builder = getTableBuilder();

        while (nodeIterator.hasNext()) {
            JsonNode child = nodeIterator.next();
            String name = child.get("key").textValue();
            String type = child.get("type").textValue();
            String comment = child.get("label").textValue();
            boolean required = child.get("notNull").asBoolean();

            if (customTypes.contains(type)) {
                models.append(buildModels(child));
                String realType = type.replace("Custom", name.substring(0, 1).toUpperCase() + name.substring(1));
                builder.addRow(name, parseType(realType), comment, required);
            }else if (enumTypes.contains(type)){
                enums.append(buildEnum(child));
                String realType = type + "[" + name.substring(0,1).toUpperCase() + name.substring(1) + "]";
                builder.addRow(name, realType, comment, required);
            }else {
                builder.addRow(name, parseType(type), comment, required);
            }

        }

        return context.append(System.getProperty("line.separator")).append(builder.build().toString()).append(System.getProperty("line.separator")).append(models)
                .append(System.getProperty("line.separator")).append(enums).toString();
    }


    private StringBuilder buildModels(JsonNode node) {

        StringBuilder builder = new StringBuilder();
        builder.append(System.getProperty("line.separator"));
        String name = node.get("key").textValue();
        String comment = node.get("label").textValue();

        String viewName = name.substring(0, 1).toUpperCase() + name.substring(1) + "(" + comment + ")";

        String type = node.get("type").textValue();

        if (this.customTypes.contains(type)) {
            return builder.append(transformToTable(node.get("custom").toString(), viewName));
        }

        return builder;
    }


    private StringBuilder buildEnum(JsonNode node) {
        StringBuilder stringBuilder = new StringBuilder();
        String type = node.get("type").textValue();
        if (!enumTypes.contains(type)) {
            return stringBuilder;
        }

        String name = node.get("key").textValue();
        JsonNode enums = node.get("enums");
        Table.Builder builder = getTableBuilder("NAME", "VALUE");
        stringBuilder.append(System.getProperty("line.separator"));

        stringBuilder.append(new Heading(name.substring(0 ,1).toUpperCase() + name.substring(1) + "(" + node.get("label").textValue() + ")", 2));
        Iterator<JsonNode> nodeIterator = enums.iterator();
        while (nodeIterator.hasNext()) {
            JsonNode child = nodeIterator.next();
            String enumName = child.get("label").textValue();
            String enumValue = child.get("value").textValue();
            builder.addRow(enumName, enumValue);
        }

        return stringBuilder.append(System.getProperty("line.separator")).append(builder.build().toString());
    }

    private Table.Builder getTableBuilder(String... heads) {
        if (heads == null || heads.length == 0) {
            return new Table.Builder()
                    .withAlignments(Table.ALIGN_LEFT, Table.ALIGN_CENTER, Table.ALIGN_RIGHT)
                    .addRow(
                            "NAME", "TYPE", "COMMENT", "REQUIRED"
                    );
        }else {
            return new Table.Builder().withAlignments(Table.ALIGN_LEFT, Table.ALIGN_CENTER, Table.ALIGN_RIGHT)
                    .addRow(heads);
        }
    }

    private String parseType(String type) {
        int index = type.indexOf("<");
        if (index > -1) {
            type = type.substring(0, index ) + "`" + type.substring(index);

        }

        index = type.indexOf(">");
        if (index > -1) {
            type = type.substring(0, index) + "`" + type.substring(index);
        }

        return type;
    }
}
