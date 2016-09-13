package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKTarkistus;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class TKTarkistusRepositoryTest extends BaseRepositoryTest<TKTarkistus> {

    @Autowired
    private TKTarkistusRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "db", "arvo", "luoja", new Date(), "opintosuoritusavain", 1, "opiskelijaavain",
                                1, "opiskeluoikeusavain", 1, "tiedonkeruu", "virhe", "virhekoodi"),
                        createEntity(2L, "db2", "arvo2", "luoja2", new Date(), "opintosuoritusavain2", 2, "opiskelijaavain2",
                                2, "opiskeluoikeusavain2", 2, "tiedonkeruu2", "virhe2", "virhekoodi2")),
                repository.streamAll());
    }

    private TKTarkistus createEntity(long id, String db, String arvo, String luoja, Date luontipaivamaara, String opintosuoritusavain, int opintosuoritusId, String opiskelijaavain, int opiskelijaId, String opiskeluoikeusavain, int opiskeluoikeusId, String tiedonkeruu, String virhe, String virhekoodi) {
        TKTarkistus entity = new TKTarkistus();
        entity.setId(id);
        entity.setDb(db);
        entity.setArvo(arvo);
        entity.setLuoja(luoja);
        entity.setLuontipaivamaara(luontipaivamaara);
        entity.setOpintosuoritusavain(opintosuoritusavain);
        entity.setOpintosuoritusId(opintosuoritusId);
        entity.setOpiskelijaavain(opiskelijaavain);
        entity.setOpiskelijaId(opiskelijaId);
        entity.setOpiskeluoikeusavain(opiskeluoikeusavain);
        entity.setOpiskeluoikeusId(opiskeluoikeusId);
        entity.setTiedonkeruu(tiedonkeruu);
        entity.setVirhe(virhe);
        entity.setVirhekoodi(virhekoodi);
        em.persist(entity);
        return entity;
    }
}