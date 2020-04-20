package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Tutkinnot;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

									
@Sql({"/sql/cleanup.sql", "/sql/tutkinnot_test.sql"})
public class TutkinnotIntegrationTest extends BaseIntegrationTest<Tutkinnot> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Tutkinnot>> content = jacksonTester.parse(streamAllRequest("/api/Tutkinnot"));
        assertJsonContent(content, "/controller/tutkinnot_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Tutkinnot/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tutkinnot_result.xml"));
    }

}