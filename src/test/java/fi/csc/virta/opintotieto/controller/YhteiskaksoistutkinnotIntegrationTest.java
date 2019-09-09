package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Yhteiskaksoistutkinnot;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/yhteiskaksoistutkinnot_test.sql"})
public class YhteiskaksoistutkinnotIntegrationTest extends BaseIntegrationTest<Yhteiskaksoistutkinnot> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Yhteiskaksoistutkinnot>> content = jacksonTester.parse(streamAllRequest("/api/Yhteiskaksoistutkinnot"));
        assertJsonContent(content, "/controller/yhteiskaksoistutkinnot_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Yhteiskaksoistutkinnot/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/yhteiskaksoistutkinnot_result.xml"));
    }

}