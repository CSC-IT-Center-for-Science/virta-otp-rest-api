package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.YOOpintopiste;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class YOOpintopisteRepositoryTest extends BaseRepositoryTest<YOOpintopiste> {

    @Autowired
    private YOOpintopisteRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(createEntity("db1", "123abc", 2016, "Desc", 2.5, 1L, 1.1),
                createEntity("db2", "234abc",  2017, "Desc2", 3.5, 2L, 2.2)), repository.streamAll());
    }

    private YOOpintopiste createEntity(String db, String koodi, int vuosi, String kuvaus, double hyvaksiluetut, long id, double erillinenopettaja) {
        YOOpintopiste op = new YOOpintopiste();
        op.setDb(db);
        op.setKoodi(koodi);
        op.setVuosi(vuosi);
        op.setId(id);
        op.setKuvaus(kuvaus);
        op.setHyvaksiluetut(hyvaksiluetut);
        op.setErillinenopettaja(erillinenopettaja);
        em.persist(op);
        return op;
    }
}