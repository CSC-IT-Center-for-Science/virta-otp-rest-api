package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMKOpintopiste;
import fi.csc.virta.opintotieto.entity.AMKOpintopisteId;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.util.Assert.isTrue;

public class AMKOpintopisteRepositoryTest extends BaseRepositoryTest {

    @Autowired
    private AMKOpintopisteRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        AMKOpintopiste op = createEntity("db1", "123abc", "abcd", 2016, "Desc", 2.5);
        isTrue(repository.streamAll().allMatch(opintopiste ->
                        opintopiste.getId().equals(op.getId()) &&
                                opintopiste.getKuvaus().equals(op.getKuvaus()) &&
                                opintopiste.getHyvaksiluetut().equals(op.getHyvaksiluetut())),
                "All matches");
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