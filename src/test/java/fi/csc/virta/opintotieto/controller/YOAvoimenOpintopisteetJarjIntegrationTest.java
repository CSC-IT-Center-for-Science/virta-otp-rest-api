package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.YOAvoimenOpintopisteetJarj;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/yo_avoimenopintopisteet_jarj_test.sql"})
public class YOAvoimenOpintopisteetJarjIntegrationTest extends BaseIntegrationTest<YOAvoimenOpintopisteetJarj> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<YOAvoimenOpintopisteetJarj>> content = jacksonTester.parse(streamAllRequest("/api/YOAvoimenOpintopisteetJarj"));
        assertJsonContent(content, "/controller/yo_avoimenopintopisteet_jarj_results.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/YOAvoimenOpintopisteetJarj/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/yo_avoimenopintopisteet_jarj_results.xml"));
    }

}