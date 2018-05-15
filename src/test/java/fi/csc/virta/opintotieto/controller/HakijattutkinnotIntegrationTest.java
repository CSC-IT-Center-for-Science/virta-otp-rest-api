package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Hakijattutkinnot;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/Hakijattutkinnot_test.sql"})
public class HakijattutkinnotIntegrationTest extends BaseIntegrationTest<Hakijattutkinnot> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Hakijattutkinnot>> content = jacksonTester.parse(streamAllRequest("/api/Hakijattutkinnot"));
        assertJsonContent(content, "/controller/Hakijattutkinnot_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Hakijattutkinnot/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/Hakijattutkinnot_result.xml"));
    }

}