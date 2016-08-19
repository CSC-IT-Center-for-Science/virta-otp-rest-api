package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.OpintopistePvmAMK;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/opintopiste_pvm_test.sql"})
public class OpintopistePvmAMKControllerIntegrationTest extends BaseIntegrationTest<OpintopistePvmAMK> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<OpintopistePvmAMK>> content = jacksonTester.parse(streamAllRequest("/api/OpintopistePvmAMK"));
        assertJsonContent(content, "/controller/opintopiste_pvm_amk_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/OpintopistePvmAMK/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/opintopiste_pvm_amk_result.xml"));
    }
}