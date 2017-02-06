package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Liikennevalot;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/liikennevalot_test.sql"})
public class LiikennevalotIntegrationTest extends BaseIntegrationTest<Liikennevalot> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Liikennevalot>> content = jacksonTester.parse(streamAllRequest("/api/Liikennevalot"));
        assertJsonContent(content, "/controller/liikennevalot_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Liikennevalot/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/liikennevalot_result.xml"));
    }

}