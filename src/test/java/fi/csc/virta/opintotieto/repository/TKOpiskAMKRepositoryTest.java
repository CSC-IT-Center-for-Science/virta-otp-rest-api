package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKOpiskAMK;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class TKOpiskAMKRepositoryTest extends BaseRepositoryTest<TKOpiskAMK> {

    @Autowired
    private TKOpiskAMKRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "aikieli", "askunta", "kansal", "kiel"),
                        createEntity(2L, "aikieli2", "askunta2", "kansal2", "kiel2")),
                repository.streamAll());
    }

    private TKOpiskAMK createEntity(long id, String aikieli, String askunta, String kansal, String kiel) {
        TKOpiskAMK entity = new TKOpiskAMK();
        entity.setId(id);
        entity.setAikieli(aikieli);
        entity.setAskunta(askunta);
        entity.setKansal(kansal);
        entity.setKiel(kiel);
        em.persist(entity);
        return entity;
    }
}