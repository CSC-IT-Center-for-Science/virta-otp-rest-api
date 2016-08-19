package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.OpintopistePvmAMK;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class OpintopistePvmAMKRepositoryTest extends BaseRepositoryTest<OpintopistePvmAMK> {

    @Autowired
    private OpintopistePvmAMKRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(createEntity(1L, "123abc", "0123"),
                createEntity(2L, "124abc", "1234")), repository.streamAll());
    }

    private OpintopistePvmAMK createEntity(long id, String koodi, String koulutustyyppi) {
        OpintopistePvmAMK op = new OpintopistePvmAMK();
        op.setId(id);
        op.setKoodi(koodi);
        op.setKoulutustyyppi(koulutustyyppi);
        em.persist(op);
        return op;
    }
}