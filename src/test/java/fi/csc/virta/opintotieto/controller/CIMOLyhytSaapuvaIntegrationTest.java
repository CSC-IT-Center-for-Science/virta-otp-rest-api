package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.CIMOLyhytSaapuva;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/cimo_lyhyt_saapuva_test.sql"})
public class CIMOLyhytSaapuvaIntegrationTest extends BaseIntegrationTest<CIMOLyhytSaapuva> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<CIMOLyhytSaapuva>> content = jacksonTester.parse(streamAllRequest("/api/CIMOLyhytSaapuva"));
        assertJsonContent(content, "/controller/cimo_lyhyt_saapuva_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/CIMOLyhytSaapuva/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/cimo_lyhyt_saapuva_result.xml"));
    }

}