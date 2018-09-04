package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Tutkinnonsuorittaneetvaihdossapervuosi;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/tutkinnonsuorittaneetvaihdossapervuosi_test.sql"})
public class TutkinnonsuorittaneetvaihdossapervuosiIntegrationTest extends BaseIntegrationTest<Tutkinnonsuorittaneetvaihdossapervuosi> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Tutkinnonsuorittaneetvaihdossapervuosi>> content = jacksonTester.parse(streamAllRequest("/api/Tutkinnonsuorittaneetvaihdossapervuosi"));
        assertJsonContent(content, "/controller/tutkinnonsuorittaneetvaihdossapervuosi_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Tutkinnonsuorittaneetvaihdossapervuosi/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tutkinnonsuorittaneetvaihdossapervuosi_result.xml"));
    }

}