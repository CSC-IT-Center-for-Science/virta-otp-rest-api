package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.OpintopistePvmYO;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/opintopiste_pvm_yo_test.sql"})
public class OpintopistePvmYOControllerIntegrationTest extends BaseIntegrationTest<OpintopistePvmYO> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<OpintopistePvmYO>> content = jacksonTester.parse(streamAllRequest("/api/OpintopistePvmYO"));
        assertJsonContent(content, "/controller/opintopiste_pvm_yo_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/OpintopistePvmYO/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/opintopiste_pvm_yo_result.xml"));
    }
}