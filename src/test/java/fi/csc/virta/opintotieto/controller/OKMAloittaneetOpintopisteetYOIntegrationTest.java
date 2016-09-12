package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.OKMAloittaneetOpintopisteetYO;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/okm_aloittaneet_opintopisteet_yo_test.sql"})
public class OKMAloittaneetOpintopisteetYOIntegrationTest extends BaseIntegrationTest<OKMAloittaneetOpintopisteetYO> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<OKMAloittaneetOpintopisteetYO>> content = jacksonTester.parse(streamAllRequest("/api/OKMAloittaneetOpintopisteetYO"));
        assertJsonContent(content, "/controller/okm_aloittaneet_opintopisteet_yo_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/OKMAloittaneetOpintopisteetYO/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/okm_aloittaneet_opintopisteet_yo_result.xml"));
    }

}