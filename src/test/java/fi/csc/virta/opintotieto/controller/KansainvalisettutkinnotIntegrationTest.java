package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Kansainvalisettutkinnot;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/kansainvalisettutkinnot_test.sql"})
public class KansainvalisettutkinnotIntegrationTest extends BaseIntegrationTest<Kansainvalisettutkinnot> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Kansainvalisettutkinnot>> content = jacksonTester.parse(streamAllRequest("/api/Kansainvalisettutkinnot"));
        assertJsonContent(content, "/controller/kansainvalisettutkinnot_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Kansainvalisettutkinnot/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/kansainvalisettutkinnot_result.xml"));
    }

}