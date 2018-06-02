package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.Tavoiteajassasuoritettututkinto;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

									
@Sql({"/sql/cleanup.sql", "/sql/tavoiteajassasuoritettututkintot_test.sql"})
public class TavoiteajassasuoritettututkintoIntegrationTest extends BaseIntegrationTest<Tavoiteajassasuoritettututkinto> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<Tavoiteajassasuoritettututkinto>> content = jacksonTester.parse(streamAllRequest("/api/Tavoiteajassasuoritettututkinto"));
        assertJsonContent(content, "/controller/tavoiteajassasuoritettututkinto_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/Tavoiteajassasuoritettututkinto/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/tavoiteajassasuoritettututkinto_result.xml"));
    }

}