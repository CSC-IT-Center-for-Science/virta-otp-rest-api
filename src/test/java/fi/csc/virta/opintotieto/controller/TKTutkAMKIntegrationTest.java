package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKTutkAMK;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/tk_tutk_amk_test.sql"})
public class TKTutkAMKIntegrationTest extends BaseIntegrationTest<TKTutkAMK> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<TKTutkAMK>> content = jacksonTester.parse(streamAllRequest("/api/TKTutkAMK"));
        assertJsonContent(content, "/controller/tk_tutk_amk_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/TKTutkAMK/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tk_tutk_amk_result.xml"));
    }

}