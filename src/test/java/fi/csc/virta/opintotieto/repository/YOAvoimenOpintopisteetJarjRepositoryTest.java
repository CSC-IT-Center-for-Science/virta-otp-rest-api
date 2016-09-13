package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.YOAvoimenOpintopisteetJarj;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class YOAvoimenOpintopisteetJarjRepositoryTest extends BaseRepositoryTest<YOAvoimenOpintopisteetJarj> {

    @Autowired
    private YOAvoimenOpintopisteetJarjRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(createEntity(1L, "db", "koodi", "kuvaus", "luoja", new Date(), 1, "tyyppi", "paivittaja", new Date(), 2016),
                createEntity(2L, "db2", "koodi2", "kuvaus2", "luoja2", new Date(), 2, "tyyppi2", "paivittaja2", new Date(), 2016)), repository.streamAll());
    }

    private YOAvoimenOpintopisteetJarj createEntity(long id, String db, String koodi, String kuvaus, String luoja, Date luontipaivamaara, int opintopisteet, String oppilaitostyyppi, String paivittaja, Date paivityspaivamaara, int vuosi) {
        YOAvoimenOpintopisteetJarj entity = new YOAvoimenOpintopisteetJarj();
        entity.setId(id);
        entity.setDb(db);
        entity.setKoodi(koodi);
        entity.setKuvaus(kuvaus);
        entity.setLuoja(luoja);
        entity.setLuontipaivamaara(luontipaivamaara);
        entity.setOpintopisteet(opintopisteet);
        entity.setOppilaitostyyppi(oppilaitostyyppi);
        entity.setPaivittaja(paivittaja);
        entity.setPaivityspaivamaara(paivityspaivamaara);
        entity.setVuosi(vuosi);
        em.persist(entity);
        return entity;
    }
}