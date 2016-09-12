package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.OpettajaPatevyydet;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/opettaja_patevyydet_test.sql"})
public class OpettajaPatevyydetIntegrationTest extends BaseIntegrationTest<OpettajaPatevyydet> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<OpettajaPatevyydet>> content = jacksonTester.parse(streamAllRequest("/api/OpettajaPatevyydet"));
        assertJsonContent(content, "/controller/opettaja_patevyydet_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/OpettajaPatevyydet/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/opettaja_patevyydet_result.xml"));
    }

}