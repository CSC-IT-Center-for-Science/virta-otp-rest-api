package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.CIMOLyhytLahteva;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/cimo_lyhyt_lahteva_test.sql"})
public class CIMOLyhytLahtevaIntegrationTest extends BaseIntegrationTest<CIMOLyhytLahteva> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<CIMOLyhytLahteva>> content = jacksonTester.parse(streamAllRequest("/api/CIMOLyhytLahteva"));
        assertJsonContent(content, "/controller/cimo_lyhyt_lahteva_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/CIMOLyhytLahteva/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/cimo_lyhyt_lahteva_result.xml"));
    }

}