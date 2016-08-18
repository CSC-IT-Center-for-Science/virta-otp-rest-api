package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AMK7SuoratTK;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/amk7suorat_test.sql"})
public class AMK7SuoratIntegrationTest extends BaseIntegrationTest<AMK7SuoratTK> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<AMK7SuoratTK>> content = jacksonTester.parse(streamAllRequest("/api/AMK7SuoratTK"));
        assertJsonContent(content, "/controller/amk7_suorat_tk_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/AMK7SuoratTK/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/amk7_suorat_tk_result.xml"));
    }

}