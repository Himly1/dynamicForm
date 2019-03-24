package himly.dynamicform.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author himly
 */
public class JacksonUtil {
    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();


    public static String toString(Object obj) {
        try {
            return OBJECT_MAPPER.writeValueAsString(obj);
        }catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static JsonNode toNode(String json) {
        try {
            return OBJECT_MAPPER.readValue(json, JsonNode.class);
        }catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
