package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMKOpintopiste;
import fi.csc.virta.opintotieto.entity.AMKOpintopisteId;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class AMKOpintopisteRepositoryTest extends BaseRepositoryTest<AMKOpintopiste> {

    @Autowired
    private AMKOpintopisteRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(createEntity("db1", "123abc", "abcd", 2016, "Desc", 2.5),
                createEntity("db2", "234abc", "bcde", 2017, "Desc2", 3.5)), repository.streamAll());
    }

    private AMKOpintopiste createEntity(String db, String koodi, String koulutustyyppi, int vuosi, String kuvaus, double hyvaksiluetut) {
        AMKOpintopiste op = new AMKOpintopiste();
        AMKOpintopisteId id = new AMKOpintopisteId();
        id.setDb(db);
        id.setKoodi(koodi);
        id.setKoulutustyyppi(koulutustyyppi);
        id.setVuosi(vuosi);
        op.setId(id);
        op.setKuvaus(kuvaus);
        op.setHyvaksiluetut(hyvaksiluetut);
        em.persist(op);
        return op;
    }
}