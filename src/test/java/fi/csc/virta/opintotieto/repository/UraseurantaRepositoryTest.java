package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Uraseuranta;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class UraseurantaRepositoryTest extends BaseRepositoryTest<Uraseuranta> {

    @Autowired
    private UraseurantaRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "aidinkieli", "aine", "arvosana", "asteikko", "asuinkuntakoodi",
                                "asuinkuntanimi", "etunimet", "henkilotunnus"),
                        createEntity(2L, "aidinkieli2", "aine2", "arvosana2", "asteikko2", "asuinkuntakoodi2",
                                "asuinkuntanimi2", "etunimet2", "henkilotunnus2")),
                repository.streamAll());
    }

    private Uraseuranta createEntity(long id, String aidinkieli, String aine, String arvosana, String asteikko, String asuinkuntaKoodi, String asuinkuntaNimi, String etunimet, String henkilotunnus) {
        Uraseuranta entity = new Uraseuranta();
        entity.setId(id);
        entity.setAidinkieli(aidinkieli);
        entity.setAine(aine);
        entity.setArvosana(arvosana);
        entity.setAsteikko(asteikko);
        entity.setAsuinkuntaKoodi(asuinkuntaKoodi);
        entity.setAsuinkuntaNimi(asuinkuntaNimi);
        entity.setEtunimet(etunimet);
        entity.setHenkilotunnus(henkilotunnus);
        em.persist(entity);
        return entity;
    }
}