package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKTutkYO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class TKTutkYORepositoryTest extends BaseRepositoryTest<TKTutkYO> {

    @Autowired
    private TKTutkYORepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "aikieliy", "kansaly", "kirtu", "kk", "koulky", "lkmmt"),
                        createEntity(2L, "aikieliy2", "kansaly2", "kirtu2", "kk2", "koulky2", "lkmmt2")),
                repository.streamAll());
    }

    private TKTutkYO createEntity(long id, String aikieliy, String kansaly, String kirtu, String kk, String koulky, String lkmmt) {
        TKTutkYO entity = new TKTutkYO();
        entity.setId(id);
        entity.setAikieliy(aikieliy);
        entity.setKansaly(kansaly);
        entity.setKirtu(kirtu);
        entity.setKk(kk);
        entity.setKoulky(koulky);
        entity.setLkmmt(lkmmt);
        em.persist(entity);
        return entity;
    }
}