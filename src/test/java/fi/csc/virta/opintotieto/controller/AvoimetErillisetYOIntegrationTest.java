package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.AvoimetErillisetYO;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/avoimet_erilliset_yo_test.sql"})
public class AvoimetErillisetYOIntegrationTest extends BaseIntegrationTest<AvoimetErillisetYO> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<AvoimetErillisetYO>> content = jacksonTester.parse(streamAllRequest("/api/AvoimetErillisetYO"));
        assertJsonContent(content, "/controller/avoimet_erilliset_yo_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/AvoimetErillisetYO/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/avoimet_erilliset_yo_result.xml"));
    }

}