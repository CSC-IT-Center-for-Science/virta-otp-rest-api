package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK8Opiskelijat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class AMK8OpiskelijatRepositoryTest extends BaseRepositoryTest<AMK8Opiskelijat> {

    @Autowired
    private AMK8OpiskelijatRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "kk", 1, "opiskelijaAvain", "ookokt", new Date(), "oikeusAvain", "org", 1, 2016),
                        createEntity(2L, "kk1", 2, "opiskelijaAvain1", "ookokt1", new Date(), "oikeusAvain1", "org1", 2, 2016)),
                repository.streamAll());
    }

    private AMK8Opiskelijat createEntity(long id, String kk, int koulutusalakoodi, String opiskelijaAvain, String kouluksenTunniste, Date opiskeluOikeudenPaattymispvm, String oikeusAvain, String organisaatiokoodi, int sukupuoli, int vuosi) {
        AMK8Opiskelijat entity = new AMK8Opiskelijat();
        entity.setId(id);
        entity.setKk(kk);
        entity.setKoulutusalakoodi(koulutusalakoodi);
        entity.setOpiskelijaAvain(opiskelijaAvain);
        entity.setOpiskeluOikeudenAlku(new Date());
        entity.setOpiskeluoikeudenKohteenaOlevanKoulutuksenTunniste(kouluksenTunniste);
        entity.setOpiskeluOikeudenPaattymispvm(opiskeluOikeudenPaattymispvm);
        entity.setOpiskeluOikeusAvain(oikeusAvain);
        entity.setOrganisaatiokoodi(organisaatiokoodi);
        entity.setSukupuoli(sukupuoli);
        entity.setVuosi(vuosi);
        em.persist(entity);
        return entity;
    }
}