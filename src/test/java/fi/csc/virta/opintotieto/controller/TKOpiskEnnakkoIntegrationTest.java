package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKOpiskEnnakko;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

									
@Sql({"/sql/cleanup.sql", "/sql/tkopiskennakko_test.sql"})
public class TKOpiskEnnakkoIntegrationTest extends BaseIntegrationTest<TKOpiskEnnakko> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<TKOpiskEnnakko>> content = jacksonTester.parse(streamAllRequest("/api/TKOpiskEnnakko"));
        assertJsonContent(content, "/controller/tkopiskennakko_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/TKOpiskEnnakko/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tkopiskennakko_result.xml"));
    }

}