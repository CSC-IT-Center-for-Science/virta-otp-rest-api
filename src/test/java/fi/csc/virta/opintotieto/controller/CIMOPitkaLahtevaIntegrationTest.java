package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.CIMOPitkaLahteva;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/cimo_pitka_lahteva_test.sql"})
public class CIMOPitkaLahtevaIntegrationTest extends BaseIntegrationTest<CIMOPitkaLahteva> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<CIMOPitkaLahteva>> content = jacksonTester.parse(streamAllRequest("/api/CIMOPitkaLahteva"));
        assertJsonContent(content, "/controller/cimo_pitka_lahteva_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/CIMOPitkaLahteva/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/cimo_pitka_lahteva_result.xml"));
    }

}