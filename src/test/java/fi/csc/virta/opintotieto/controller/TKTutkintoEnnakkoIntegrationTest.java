package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKTutkintoEnnakko;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/tk_tutkinto_ennakko_test.sql"})
public class TKTutkintoEnnakkoIntegrationTest extends BaseIntegrationTest<TKTutkintoEnnakko> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<TKTutkintoEnnakko>> content = jacksonTester.parse(streamAllRequest("/api/TKTutkintoEnnakko"));
        assertJsonContent(content, "/controller/tktutkintoennakko_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/TKTutkintoEnnakko/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tktutkintoennakko_result.xml"));
    }

}