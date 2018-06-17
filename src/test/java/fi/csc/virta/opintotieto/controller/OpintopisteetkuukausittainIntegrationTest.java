package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Opintopisteetkuukausittain;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

									
@Sql({"/sql/cleanup.sql", "/sql/opintopisteetkuukausittain_test.sql"})
public class OpintopisteetkuukausittainIntegrationTest extends BaseIntegrationTest<Opintopisteetkuukausittain> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Opintopisteetkuukausittain>> content = jacksonTester.parse(streamAllRequest("/api/Opintopisteetkuukausittain"));
        assertJsonContent(content, "/controller/opintopisteetkuukausittain_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Opintopisteetkuukausittain/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/opintopisteetkuukausittain_result.xml"));
    }

}