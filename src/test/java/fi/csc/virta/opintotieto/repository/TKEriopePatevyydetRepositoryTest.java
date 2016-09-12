package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKEriopePatevyydet;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class TKEriopePatevyydetRepositoryTest extends BaseRepositoryTest<TKEriopePatevyydet> {

    @Autowired
    private TKEriopePatevyydetRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "db", "erillisetopettajaopinnot", "etunimet", "henkilonnimi", "henkilotunnus",
                                "koulutuksensijaintikunta", "kunta", "opintosuorituksenavain", "opiskelijaavain",
                                "oppilaitosnimi", "oppilaitostunnus", new Date(), "patevyysselite", "sukunimi", new Date(),
                                "suoritusvuosijakuukausi"),
                        createEntity(2L, "db2", "erillisetopettajaopinnot2", "etunimet2", "henkilonnimi2", "henkilotunnus2",
                                "koulutuksensijaintikunta2", "kunta2", "opintosuorituksenavain2", "opiskelijaavain2",
                                "oppilaitosnimi2", "oppilaitostunnus2", new Date(), "patevyysselite2", "sukunimi2", new Date(),
                                "suoritusvuosijakuukausi2")),
                repository.streamAll());
    }

    private TKEriopePatevyydet createEntity(long id, String db, String erillisetOpettajanOpinnot, String etunimet, String henkilonNimi, String henkilotunnus, String koulutuksenSijaintikunta, String kunta, String opintosuorituksenAvain, String opiskelijaAvain, String oppilaitosnimi, String oppilaitostunnus, Date paivityspvm, String patevyysSelite, String sukunimi, Date suorituspvm, String suoritusvuosiJaKuukausi) {
        TKEriopePatevyydet entity = new TKEriopePatevyydet();
        entity.setDb(db);
        entity.setErillisetOpettajanOpinnot(erillisetOpettajanOpinnot);
        entity.setEtunimet(etunimet);
        entity.setHenkilonNimi(henkilonNimi);
        entity.setHenkilotunnus(henkilotunnus);
        entity.setId(id);
        entity.setKoulutuksenSijaintikunta(koulutuksenSijaintikunta);
        entity.setKunta(kunta);
        entity.setOpintosuorituksenAvain(opintosuorituksenAvain);
        entity.setOpiskelijaAvain(opiskelijaAvain);
        entity.setOppilaitosnimi(oppilaitosnimi);
        entity.setOppilaitostunnus(oppilaitostunnus);
        entity.setPaivityspvm(paivityspvm);
        entity.setPatevyysSelite(patevyysSelite);
        entity.setSukunimi(sukunimi);
        entity.setSuorituspvm(suorituspvm);
        entity.setSuoritusvuosiJaKuukausi(suoritusvuosiJaKuukausi);
        em.persist(entity);
        return entity;
    }
}