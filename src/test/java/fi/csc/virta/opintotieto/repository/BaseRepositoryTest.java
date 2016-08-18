package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.TestApplication;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@TestPropertySource(locations = "/test.properties")
@DataJpaTest
public abstract class BaseRepositoryTest {
    @Autowired
    protected EntityManager em;
}
