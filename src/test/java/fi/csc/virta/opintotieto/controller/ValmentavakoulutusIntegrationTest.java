package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Valmentavakoulutus;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

									
@Sql({"/sql/cleanup.sql", "/sql/valmentavakoulutus_test.sql"})
public class ValmentavakoulutusIntegrationTest extends BaseIntegrationTest<Valmentavakoulutus> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Valmentavakoulutus>> content = jacksonTester.parse(streamAllRequest("/api/Valmentavakoulutus"));
        assertJsonContent(content, "/controller/valmentavakoulutus_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Valmentavakoulutus/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/valmentavakoulutus_result.xml"));
    }

}