package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Opinnaytetyot;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/opinnaytetyot_test.sql"})
public class OpinnaytetyotIntegrationTest extends BaseIntegrationTest<Opinnaytetyot> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Opinnaytetyot>> content = jacksonTester.parse(streamAllRequest("/api/Opinnaytetyot"));
        assertJsonContent(content, "/controller/opinnaytetyot_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Opinnaytetyot/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/opinnaytetyot_result.xml"));
    }

}