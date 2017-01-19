package fi.csc.virta.opintotieto.controller;

import fi.csc.virta.opintotieto.entity.YO6AvoimetErillisetSummataulukko;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@Sql({"/sql/cleanup.sql", "/sql/YO6AvoimetErillisetSummataulukko_test.sql"})
public class YO6AvoimetErillisetSummataulukkoIntegrationTest extends BaseIntegrationTest<YO6AvoimetErillisetSummataulukko> {

    @Test
    public void testStreamAll() throws Exception {
        ObjectContent<List<YO6AvoimetErillisetSummataulukko>> content = jacksonTester.parse(streamAllRequest("/api/YO6AvoimetErillisetSummataulukko"));
        assertJsonContent(content, "/controller/YO6AvoimetErillisetSummataulukko_result.json");
    }

    @Test
    public void testStreamAllXml() throws Exception {
        String content = streamAllRequest("/api/YO6AvoimetErillisetSummataulukko/xml");
        assertThat(content).isXmlEqualToContentOf(getResourceAsFile("/controller/YO6AvoimetErillisetSummataulukko_result.xml"));
    }

}