package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.ViisViis;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/viisviis_test.sql"})
public class ViisViisIntegrationTest extends BaseIntegrationTest<ViisViis> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<ViisViis>> content = jacksonTester.parse(streamAllRequest("/api/ViisViis"));
        assertJsonContent(content, "/controller/viisviis_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/ViisViis/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/viisviis_result.xml"));
    }

}