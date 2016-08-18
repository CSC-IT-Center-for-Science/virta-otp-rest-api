package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK8SuoratTK;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/amk8suorat_test.sql"})
public class AMK8SuoratIntegrationTest extends BaseIntegrationTest<AMK8SuoratTK> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<AMK8SuoratTK>> content = jacksonTester.parse(streamAllRequest("/api/AMK8SuoratTK"));
        assertJsonContent(content, "/controller/amk8_suorat_tk_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/AMK8SuoratTK/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/amk8_suorat_tk_result.xml"));
    }

}