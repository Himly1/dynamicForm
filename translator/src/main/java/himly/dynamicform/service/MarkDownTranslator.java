package himly.dynamicform.service;

/**
 * @author himly
 */
public interface MarkDownTranslator {

    /**
     * translator the json of dynamic form to markdown.
     * @param formJson form json definition
     * @return markDown formatted string.
     */
    String transformToTable(String formJson, String formName);
}
