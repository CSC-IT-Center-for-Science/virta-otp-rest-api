package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKOpiskYO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class TKOpiskYORepositoryTest extends BaseRepositoryTest<TKOpiskYO> {

    @Autowired
    private TKOpiskYORepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "aikieliy", "askuntay", "avo", "fuksi", "kansaly"),
                        createEntity(2L, "aikieliy2", "askuntay2", "avo2", "fuksi2", "kansaly2")),
                repository.streamAll());
    }

    private TKOpiskYO createEntity(long id, String aikieliy, String askuntay, String avo, String fuksi, String kansaly) {
        TKOpiskYO entity = new TKOpiskYO();
        entity.setId(id);
        entity.setAikieliy(aikieliy);
        entity.setAskuntay(askuntay);
        entity.setAvo(avo);
        entity.setFuksi(fuksi);
        entity.setKansaly(kansaly);
        em.persist(entity);
        return entity;
    }
}