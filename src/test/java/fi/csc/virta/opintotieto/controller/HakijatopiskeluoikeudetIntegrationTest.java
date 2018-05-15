package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Hakijatopiskeluoikeudet;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/Hakijatopiskeluoikeudet_test.sql"})
public class HakijatopiskeluoikeudetIntegrationTest extends BaseIntegrationTest<Hakijatopiskeluoikeudet> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Hakijatopiskeluoikeudet>> content = jacksonTester.parse(streamAllRequest("/api/Hakijatopiskeluoikeudet"));
        assertJsonContent(content, "/controller/Hakijatopiskeluoikeudet_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Hakijatopiskeluoikeudet/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/Hakijatopiskeluoikeudet_result.xml"));
    }

}