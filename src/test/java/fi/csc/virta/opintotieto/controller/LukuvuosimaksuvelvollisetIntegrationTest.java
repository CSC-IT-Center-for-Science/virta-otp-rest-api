package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Lukuvuosimaksuvelvolliset;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/lukuvuosimaksuvelvolliset_test.sql"})
public class LukuvuosimaksuvelvollisetIntegrationTest extends BaseIntegrationTest<Lukuvuosimaksuvelvolliset> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Lukuvuosimaksuvelvolliset>> content = jacksonTester.parse(streamAllRequest("/api/Lukuvuosimaksuvelvolliset"));
        assertJsonContent(content, "/controller/lukuvuosimaksuvelvolliset_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Lukuvuosimaksuvelvolliset/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/lukuvuosimaksuvelvolliset_result.xml"));
    }

}