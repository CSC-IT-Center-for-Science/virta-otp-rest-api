package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKTarkistus;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/tk_tarkistus_test.sql"})
public class TKTarkistusIntegrationTest extends BaseIntegrationTest<TKTarkistus> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<TKTarkistus>> content = jacksonTester.parse(streamAllRequest("/api/TKTarkistus"));
        assertJsonContent(content, "/controller/tk_tarkistus_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/TKTarkistus/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tk_tarkistus_result.xml"));
    }

}