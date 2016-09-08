package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK7Opiskelijat;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/amk7opiskelijat_test.sql"})
public class AMK7OpiskelijatIntegrationTest extends BaseIntegrationTest<AMK7Opiskelijat> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<AMK7Opiskelijat>> content = jacksonTester.parse(streamAllRequest("/api/AMK7Opiskelijat"));
        assertJsonContent(content, "/controller/amk7_opiskelijat_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/AMK7Opiskelijat/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/amk7_opiskelijat_result.xml"));
    }

}