package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.OpintopistePvmYO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class OpintopistePvmYORepositoryTest extends BaseRepositoryTest<OpintopistePvmYO> {

    @Autowired
    private OpintopistePvmYORepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                createEntity(1L, 10, 1, 1, "db", 1, 1, 1, "koodi", "kuvaus", 1, "luoja", new Date(), "oppilaitostunnus", 1, new Date(), 1, 1, 1, 2016),
                createEntity(2L, 10, 2, 2, "db2", 2, 2, 2, "koodi2", "kuvaus2", 2, "luoja2", new Date(), "oppilaitostunnus2", 2, new Date(), 1, 2, 2, 2016)), repository.streamAll());
    }

    private OpintopistePvmYO createEntity(long id, int erikoistumiskoulutus, int erillinenOpintoOpettaja, int avoinKK, String db, int erillinenOpintoOikeus, int kansainvVaihto, int kkYhteistyo, String koodi, String kuvaus, int lukumaara, String luoja, Date luontipaivamaara, String oppilaitostunnus, int perustutkOpiskelijat, Date suorituspaiva, int ulkomaaharjoittelu, int ulkomailtaHyvLuet, int vieraskSuoritukset, int vuosi) {
        OpintopistePvmYO entity = new OpintopistePvmYO();
        entity.setId(id);
		entity.setErikoistumiskoulutus(erikoistumiskoulutus);
        entity.setErillinenOpintoOpettaja(erillinenOpintoOpettaja);
        entity.setAvoinKK(avoinKK);
        entity.setDb(db);
        entity.setErillinenOpintoOikeus(erillinenOpintoOikeus);
        entity.setKansainvVaihto(kansainvVaihto);
        entity.setKkYhteistyo(kkYhteistyo);
        entity.setKoodi(koodi);
        entity.setKuvaus(kuvaus);
        entity.setLukumaara(lukumaara);
        entity.setLuoja(luoja);
        entity.setLuontipaivamaara(luontipaivamaara);
        entity.setOppilaitostunnus(oppilaitostunnus);
        entity.setPerustutkOpiskelijat(perustutkOpiskelijat);
        entity.setSuorituspaiva(suorituspaiva);
		entity.setUlkomaaharjoittelu(ulkomaaharjoittelu);
        entity.setUlkomailtaHyvLuet(ulkomailtaHyvLuet);
        entity.setVieraskSuoritukset(vieraskSuoritukset);
        entity.setVuosi(vuosi);
        em.persist(entity);
        return entity;
    }
}