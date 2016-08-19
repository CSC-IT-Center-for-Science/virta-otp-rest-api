package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.TestApplication;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.samePropertyValuesAs;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@TestPropertySource(locations = "/test.properties")
@DataJpaTest
public abstract class BaseRepositoryTest<T> {
    @Autowired
    protected EntityManager em;

    protected void assertStreamResults(List<T> expected, Stream<T> stream) {
        List<T> list = stream.collect(Collectors.toList());
        assertThat("Size matches", list.size(), is(equalTo(expected.size())));
        for (int i = 0; i < expected.size(); i++) {
            assertThat("Entity properties matches", list.get(i), samePropertyValuesAs(expected.get(i)));
        }
    }
}
