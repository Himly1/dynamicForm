package himly.dynamicform.controller;

import himly.dynamicform.service.MarkDownTranslator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author himly z1399956473@gmail.com
 */
@RestController
@RequestMapping(value = "/dynamic-form/mark-down-translator")
public class MarkDownTranslatorController {
    private static final Logger LOG = LoggerFactory.getLogger(MarkDownTranslatorController.class);

    private final MarkDownTranslator markDownTranslator;

    public MarkDownTranslatorController(MarkDownTranslator markDownTranslator) {
        this.markDownTranslator = markDownTranslator;
    }

    @GetMapping(value = "/{dynamicFormJsonDefinition}")
    public ResponseEntity<String> translateForm(@PathVariable String dynamicFormJsonDefinition, String name) {
        try{
           String markDownString =  markDownTranslator.transformToTable(dynamicFormJsonDefinition, name);
           return new ResponseEntity<>(markDownString, HttpStatus.OK);
        }catch (Exception ex) {
            LOG.error("Has an error {}", ex, ex.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
