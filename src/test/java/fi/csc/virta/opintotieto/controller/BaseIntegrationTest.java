package fi.csc.virta.opintotieto.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import fi.csc.virta.opintotieto.Application;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.ObjectContent;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "/test.properties")
public abstract class BaseIntegrationTest<T> {

    protected Logger log = LoggerFactory.getLogger(getClass());

    protected JacksonTester<List<T>> jacksonTester = null;

    @Autowired
    protected TestRestTemplate restTemplate;

    @Before
    public void setup() {
        JacksonTester.initFields(this, new ObjectMapper());
    }

    protected void assertJsonContent(ObjectContent<List<T>> content, String expectedFileName) throws IOException {
        assertThat(jacksonTester.write(content.getObject()))
                .isEqualToJson(getResourceAsFile(expectedFileName));
    }

    protected File getResourceAsFile(String expectedFileName) {
        return new File(getClass().getResource((expectedFileName)).getFile());
    }

    protected String streamAllRequest(String url) throws IOException {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        Assert.assertEquals("Status code should match!", 200, responseEntity.getStatusCodeValue());
        log.info("Response content {}", responseEntity.getBody());
        return responseEntity.getBody();
    }
}
