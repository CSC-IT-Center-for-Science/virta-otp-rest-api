package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Lasnaolotvuosittain;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

									
@Sql({"/sql/cleanup.sql", "/sql/Lasnaolotvuosittain_test.sql"})
public class LasnaolotvuosittainIntegrationTest extends BaseIntegrationTest<Lasnaolotvuosittain> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Lasnaolotvuosittain>> content = jacksonTester.parse(streamAllRequest("/api/Lasnaolotvuosittain"));
        assertJsonContent(content, "/controller/Lasnaolotvuosittain_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Lasnaolotvuosittain/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/Lasnaolotvuosittain_result.xml"));
    }

}