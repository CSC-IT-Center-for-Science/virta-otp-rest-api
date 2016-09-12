package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.OpettajaPatevyydet;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class OpettajaPatevyydetRepositoryTest extends BaseRepositoryTest<OpettajaPatevyydet> {

    @Autowired
    private OpettajaPatevyydetRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                createEntity(1L, "db", 1, "henkilotunnus", 1.1, "opintosuoritusavain", 1, "opiskelijaavain", "oppilaitostyyppikoodi", "organisaatiokoodi", new Date(), "patevyyskoodi", "patevyysnimi", new Date(), 2016),
                createEntity(2L, "db2", 2, "henkilotunnus2", 2.2, "opintosuoritusavain2", 2, "opiskelijaavain2", "oppilaitostyyppikoodi2", "organisaatiokoodi2", new Date(), "patevyyskoodi2", "patevyysnimi2", new Date(), 2016)), repository.streamAll());
    }

    private OpettajaPatevyydet createEntity(long id, String db, int henkiloID, String henkilotunnus, double laajuus, String opintosuoritusAvain, int opintosuoritusLaji, String opiskelijaAvain, String oppilaitostyyppikoodi, String organisaatiokoodi, Date paivamaara, String patevyyskoodi, String patevyysNimi, Date regDatum, int vuosi) {
        OpettajaPatevyydet entity = new OpettajaPatevyydet();
        entity.setId(id);
        entity.setDb(db);
        entity.setHenkiloID(henkiloID);
        entity.setHenkilotunnus(henkilotunnus);
        entity.setLaajuus(laajuus);
        entity.setOpintosuoritusAvain(opintosuoritusAvain);
        entity.setOpintosuorituslaji(opintosuoritusLaji);
        entity.setOpiskelijaAvain(opiskelijaAvain);
        entity.setOppilaitostyyppiKoodi(oppilaitostyyppikoodi);
        entity.setOrganisaatiokoodi(organisaatiokoodi);
        entity.setPaivamaara(paivamaara);
        entity.setPatevyysKoodi(patevyyskoodi);
        entity.setPatevyysNimi(patevyysNimi);
        entity.setRegDatum(regDatum);
        entity.setVuosi(vuosi);
        em.persist(entity);
        return entity;
    }
}