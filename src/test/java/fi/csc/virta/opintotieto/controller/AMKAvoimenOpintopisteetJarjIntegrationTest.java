package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMKOpintopiste;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/amk_avoimenopintopisteet_jarj_test.sql"})
public class AMKAvoimenOpintopisteetJarjIntegrationTest extends BaseIntegrationTest<AMKOpintopiste> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<AMKOpintopiste>> content = jacksonTester.parse(streamAllRequest("/api/AMKAvoimenOpintopisteetJarj"));
        assertJsonContent(content, "/controller/amk_avoimenopintopisteet_jarj_results.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/AMKAvoimenOpintopisteetJarj/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/amk_avoimenopintopisteet_jarj_results.xml"));
    }

}