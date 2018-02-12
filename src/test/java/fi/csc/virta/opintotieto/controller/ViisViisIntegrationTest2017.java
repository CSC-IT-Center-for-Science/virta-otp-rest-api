package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.ViisViis2017;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/viisviis_test.sql"})
public class ViisViisIntegrationTest2017 extends BaseIntegrationTest<ViisViis2017> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<ViisViis2017>> content = jacksonTester.parse(streamAllRequest("/api/ViisViis2017"));
        assertJsonContent(content, "/controller/viisviis_result2017.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/ViisViis2017/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/viisviis_result2017.xml"));
    }

}