package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKTutkYO;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/tk_tutk_yo_test.sql"})
public class TKTutkYOIntegrationTest extends BaseIntegrationTest<TKTutkYO> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<TKTutkYO>> content = jacksonTester.parse(streamAllRequest("/api/TKTutkYO"));
        assertJsonContent(content, "/controller/tk_tutk_yo_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/TKTutkYO/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tk_tutk_yo_result.xml"));
    }

}