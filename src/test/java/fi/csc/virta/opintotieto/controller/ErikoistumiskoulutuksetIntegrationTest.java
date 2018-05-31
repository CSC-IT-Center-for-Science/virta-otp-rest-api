package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Erikoistumiskoulutukset;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/erikoistumiskoulutukset_test.sql"})
public class ErikoistumiskoulutuksetIntegrationTest extends BaseIntegrationTest<Erikoistumiskoulutukset> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Erikoistumiskoulutukset>> content = jacksonTester.parse(streamAllRequest("/api/Erikoistumiskoulutukset"));
        assertJsonContent(content, "/controller/erikoistumiskoulutukset_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Erikoistumiskoulutukset/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/erikoistumiskoulutukset_result.xml"));
    }

}