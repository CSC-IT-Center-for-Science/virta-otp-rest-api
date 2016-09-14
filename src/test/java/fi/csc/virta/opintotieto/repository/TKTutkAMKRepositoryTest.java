package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKTutkAMK;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class TKTutkAMKRepositoryTest extends BaseRepositoryTest<TKTutkAMK> {

    @Autowired
    private TKTutkAMKRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "aikieli", "askunta", "kansal", "kiel"),
                        createEntity(2L, "aikieli2", "askunta2", "kansal2", "kiel2")),
                repository.streamAll());
    }

    private TKTutkAMK createEntity(long id, String aikieli, String askunta, String kansal, String kiel) {
        TKTutkAMK entity = new TKTutkAMK();
        entity.setId(id);
        entity.setAikieli(aikieli);
        entity.setAskunta(askunta);
        entity.setKansal(kansal);
        entity.setKiel(kiel);
        em.persist(entity);
        return entity;
    }
}