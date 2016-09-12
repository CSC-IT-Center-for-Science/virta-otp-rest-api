package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.OKMAloittaneetOpintopisteetYO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class OKMAloittaneetOpintopisteetYORepositoryTest extends BaseRepositoryTest<OKMAloittaneetOpintopisteetYO> {

    @Autowired
    private OKMAloittaneetOpintopisteetYORepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "fuksi", "kirtu", "kk", "koulk", "luoja", new Date(),
                                "olosyys", "opiskelijaavain", 1, "opiskeluoikeusavain", 1, "opoik", 1),
                        createEntity(2L, "fuksi2", "kirtu2", "kk2", "koulk2", "luoja2", new Date(),
                                "olosyys2", "opiskelijaavain2", 2, "opiskeluoikeusavain2", 2, "opoik2", 2)),
                repository.streamAll());
    }

    private OKMAloittaneetOpintopisteetYO createEntity(long id, String fuksi, String kirtu, String kk, String koulk,
                                                      String luoja, Date luontipaivamaara, String olosyys, String opiskelijaavain,
                                                      int opiskelijaId, String opiskeluoikeusavain, int opiskeluoikeusId, String opoik,
                                                      int opsyksy) {
        OKMAloittaneetOpintopisteetYO entity = new OKMAloittaneetOpintopisteetYO();
        entity.setId(id);
        entity.setFuksi(fuksi);
        entity.setKirtu(kirtu);
        entity.setKk(kk);
        entity.setKoulk(koulk);
        entity.setLuoja(luoja);
        entity.setLuontipaivamaara(luontipaivamaara);
        entity.setOlosyys(olosyys);
        entity.setOpiskelijaavain(opiskelijaavain);
        entity.setOpiskelijaId(opiskelijaId);
        entity.setOpiskeluoikeusavain(opiskeluoikeusavain);
        entity.setOpiskeluoikeusId(opiskeluoikeusId);
        entity.setOpoik(opoik);
        entity.setOpsyksy(opsyksy);
        em.persist(entity);
        return entity;
    }
}