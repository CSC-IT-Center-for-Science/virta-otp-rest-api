package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKOpiskYO;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/tk_opisk_yo_test.sql"})
public class TKOpiskYOIntegrationTest extends BaseIntegrationTest<TKOpiskYO> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<TKOpiskYO>> content = jacksonTester.parse(streamAllRequest("/api/TKOpiskYO"));
        assertJsonContent(content, "/controller/tk_opisk_yo_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/TKOpiskYO/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tk_opisk_yo_result.xml"));
    }

}