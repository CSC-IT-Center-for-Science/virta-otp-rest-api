package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.TKEriopePatevyydet;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/sql/cleanup.sql", "/sql/tk_eriope_patevyydet_test.sql"})
public class TKEriopePatevyydetIntegrationTest extends BaseIntegrationTest<TKEriopePatevyydet> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<TKEriopePatevyydet>> content = jacksonTester.parse(streamAllRequest("/api/TKEriopePatevyydet"));
        assertJsonContent(content, "/controller/tk_eriope_patevyydet_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/TKEriopePatevyydet/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tk_eriope_patevyydet_result.xml"));
    }

}