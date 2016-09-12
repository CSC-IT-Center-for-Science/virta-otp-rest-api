package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKOpiskAMK;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/tk_opisk_amk_test.sql"})
public class TKOpiskAMKIntegrationTest extends BaseIntegrationTest<TKOpiskAMK> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<TKOpiskAMK>> content = jacksonTester.parse(streamAllRequest("/api/TKOpiskAMK"));
        assertJsonContent(content, "/controller/tk_opisk_amk_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/TKOpiskAMK/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tk_opisk_amk_result.xml"));
    }

}