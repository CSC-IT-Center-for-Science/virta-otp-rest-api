package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.ViisViis2017;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class ViisViisRepositoryTest2017 extends BaseRepositoryTest<ViisViis2017> {

    @Autowired
    private ViisViisRepository2017 repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L, 1, 19, 1, new Date(), 1, 1, new Date(), 1, "1", "1", 1, "aa", "aa", 1, 1, new Date(), 1, 0, 0, 0, 0, 1, "123456", 0, 1, 0, 2016),
                        createEntity( 2L, 2, 22, 2, new Date(), 1, 2, new Date(), 2, "2", "2", 2, "bb", "bb", 0, 0, new Date(), 2, 0, 0, 0, 0, 0, "234567", 0, 0, 0, 2016),
						createEntity( 3L, 0, 30, 0, new Date(), 0, 0, new Date(), 0, "0", "0", 0, "cc", "cc", 0, 0, new Date(), 1, 0, 0, 0, 0, 0, "345678", 0, 0, 0, 2016)
						),						
						repository.streamAll()
										);
    }

    private ViisViis2017 createEntity( long id, int edellinenSyysolo, int ika, int kevat, Date loAloituspvm, int olok, int olos, Date ooAloituspvm, int opSummaKunOtePankista, String opiskelijaavain, String opiskeluoikeusavain, int opiskeluoikeusid, String oppilaitos, String oppilaitostunnus, int pankkiKumuEnnen55, int pankkiSaldo55, Date regDatum, int sukupuoli, int summa, int suorittanut27, int suorittanut55IlmanPankkia, int suorittanut55PankinAvulla, int syys, String tkoodi, int uusiOpisk, int uusiOpiskKevat, int uuttaPankkiin, int vuosi) {
        		
		ViisViis2017 entity = new ViisViis2017();
		
		entity.setId(id);
		entity.setEdellinenSyysolo(edellinenSyysolo);
		entity.setIka(ika);
		entity.setKevat(kevat);
		entity.setLoAloituspvm(loAloituspvm);
		entity.setOlok(olok);
		entity.setOlos(olos);
		entity.setOoAloituspvm(ooAloituspvm);
		entity.setOpSummaKunOtePankista(opSummaKunOtePankista);
		entity.setOpiskelijaavain(opiskelijaavain);
		entity.setOpiskeluoikeusavain(opiskeluoikeusavain);
		entity.setOpiskeluoikeusid(opiskeluoikeusid);
		entity.setOppilaitos(oppilaitos);
		entity.setOppilaitostunnus(oppilaitostunnus);
		entity.setPankkiKumuEnnen55(pankkiKumuEnnen55);
		entity.setPankkiSaldo55(pankkiSaldo55);
		entity.setRegDatum(regDatum);
		entity.setSukupuoli(sukupuoli);
		entity.setSumma(summa);
		entity.setSuorittanut27(suorittanut27);
		entity.setSuorittanut55IlmanPankkia(suorittanut55IlmanPankkia);
		entity.setSuorittanut55PankinAvulla(suorittanut55PankinAvulla);
		entity.setSyys(syys);
		entity.setTkoodi(tkoodi);
		entity.setUusiOpisk(uusiOpisk);
		entity.setUusiOpiskKevat(uusiOpiskKevat);
		entity.setUuttaPankkiin(uuttaPankkiin);
		entity.setVuosi(vuosi);
		
        em.persist(entity);
		
        return entity;
    }
}