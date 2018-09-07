package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Rekrytohtorit;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/rekrytohtorit_test.sql"})
public class RekrytohtoritIntegrationTest extends BaseIntegrationTest<Rekrytohtorit> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Rekrytohtorit>> content = jacksonTester.parse(streamAllRequest("/api/Rekrytohtorit"));
        assertJsonContent(content, "/controller/rekrytohtorit_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Rekrytohtorit/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/rekrytohtorit_result.xml"));
    }

}