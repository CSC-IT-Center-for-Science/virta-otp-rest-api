package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.CIMOPitkaSaapuva;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/cimo_pitka_saapuva_test.sql"})
public class CIMOPitkaSaapuvaIntegrationTest extends BaseIntegrationTest<CIMOPitkaSaapuva> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<CIMOPitkaSaapuva>> content = jacksonTester.parse(streamAllRequest("/api/CIMOPitkaSaapuva"));
        assertJsonContent(content, "/controller/cimo_pitka_saapuva_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/CIMOPitkaSaapuva/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/cimo_pitka_saapuva_result.xml"));
    }

}