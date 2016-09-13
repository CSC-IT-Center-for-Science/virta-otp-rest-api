package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.YOOpintopiste;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/yo_opintopiste_test.sql"})
public class YOOpintopisteIntegrationTest extends BaseIntegrationTest<YOOpintopiste> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<YOOpintopiste>> content = jacksonTester.parse(streamAllRequest("/api/YOOpintopiste"));
        assertJsonContent(content, "/controller/yo_opintopiste_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/YOOpintopiste/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/yo_opintopiste_result.xml"));
    }

}