package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Uraseuranta;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/uraseuranta_test.sql"})
public class UraseurantaIntegrationTest extends BaseIntegrationTest<Uraseuranta> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Uraseuranta>> content = jacksonTester.parse(streamAllRequest("/api/Uraseuranta"));
        assertJsonContent(content, "/controller/uraseuranta_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Uraseuranta/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/uraseuranta_result.xml"));
    }

}