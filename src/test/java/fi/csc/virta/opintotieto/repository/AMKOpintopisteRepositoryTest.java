package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMKOpintopiste;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class AMKOpintopisteRepositoryTest extends BaseRepositoryTest<AMKOpintopiste> {

    @Autowired
    private AMKOpintopisteRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(createEntity("db1", "123abc", "abcd", 2016, "Desc", 2.5, 1L, 0.0),
                createEntity("db2", "234abc", "bcde", 2017, "Desc2", 3.5, 2L, 0.0)), repository.streamAll());
    }

    private AMKOpintopiste createEntity(String db, String koodi, String koulutustyyppi, int vuosi, String kuvaus, double hyvaksiluetut, long id, double ulkomaaharjoittelu) {
        AMKOpintopiste op = new AMKOpintopiste();
        op.setDb(db);
        op.setKoodi(koodi);
        op.setKoulutustyyppi(koulutustyyppi);
        op.setVuosi(vuosi);
        op.setId(id);
        op.setKuvaus(kuvaus);
        op.setHyvaksiluetut(hyvaksiluetut);
		op.setUlkomaaHarjoittelu(ulkomaaharjoittelu);
        em.persist(op);
        return op;
    }
}