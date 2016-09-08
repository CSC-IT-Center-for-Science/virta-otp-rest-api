package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK8Opiskelijat;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/amk8opiskelijat_test.sql"})
public class AMK8OpiskelijatIntegrationTest extends BaseIntegrationTest<AMK8Opiskelijat> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<AMK8Opiskelijat>> content = jacksonTester.parse(streamAllRequest("/api/AMK8Opiskelijat"));
        assertJsonContent(content, "/controller/amk8_opiskelijat_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/AMK8Opiskelijat/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/amk8_opiskelijat_result.xml"));
    }

}