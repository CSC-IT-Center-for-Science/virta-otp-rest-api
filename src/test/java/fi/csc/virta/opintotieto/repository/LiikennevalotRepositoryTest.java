package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Liikennevalot;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class LiikennevalotRepositoryTest extends BaseRepositoryTest<Liikennevalot> {

    @Autowired
    private LiikennevalotRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L, 1, "aa", 1, 1, 1, "1", new Date(),  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "11", 1, 1, 1),
                        createEntity( 2L, 2, "bb", 2, 2, 2, "2", new Date(),  2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, "22", 2, 2, 2),
						createEntity( 3L, 3, "cc", 3, 3, 3, "3", new Date(),  3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, "33", 3, 3, 3)
						),						
						repository.streamAll()
										);
    }

    private Liikennevalot createEntity( long id, int ensisijaisuusPuuttuu, String kk, int lasnaolevienTutkintoopiskelijoidenLkm, int liikkuvuusjaksojenLkm, 
										int lukukausiilmoittautumisiaVuosilleLkm, 
										String luoja, Date luontipaivamaara, 
										int opintosuoritukseltaPuuttuuNimi, int opintosuoritukseltaPuuttuuArvosana, int opintosuoritukseltaPuuttuuKoulutusala, 
										int opintosuorituksenSisaltyvyys, int opintosuoritusIlmanOpintooikeuttaAmk, int opiskelijallaEiOleHetua, 
										int opiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta, int opiskelijoidenLkm, 
										int opiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa, 
										int opiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa, int opiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia, 
										int opiskeluoikeusjaksoltaPuuttuuKoulutuskoodi, String oppilaitostunnus										
										,int tietovarannonTietojenPaivitysLainMukaisellaAikataululla, 
										 int tutkintoIlmanKoulutuskoodia, int tutkintoopiskelijoidenLkm ) {
        		
		Liikennevalot entity = new Liikennevalot();
	
		entity.setId(id);
		entity.setEnsisijaisuusPuuttuu(ensisijaisuusPuuttuu);
		entity.setKk(kk);
		entity.setLasnaolevienTutkintoopiskelijoidenLkm(lasnaolevienTutkintoopiskelijoidenLkm);
		entity.setLiikkuvuusjaksojenLkm(liikkuvuusjaksojenLkm);
		entity.setLukukausiilmoittautumisiaVuosilleLkm(lukukausiilmoittautumisiaVuosilleLkm);
		entity.setLuoja(luoja);
		entity.setLuontipaivamaara(new Date());
		entity.setOpintosuoritukseltaPuuttuuArvosana(opintosuoritukseltaPuuttuuArvosana);
		entity.setOpintosuoritukseltaPuuttuuNimi(opintosuoritukseltaPuuttuuNimi);
		entity.setOpintosuoritukseltaPuuttuuKoulutusala(opintosuoritukseltaPuuttuuKoulutusala);
		entity.setOpintosuorituksenSisaltyvyys(opintosuorituksenSisaltyvyys);
		entity.setOpintosuoritusIlmanOpintooikeuttaAmk(opintosuoritusIlmanOpintooikeuttaAmk);
		entity.setOpiskelijallaEiOleHetua(opiskelijallaEiOleHetua);
		entity.setOpiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta(opiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta);
		entity.setOpiskelijoidenLkm(opiskelijoidenLkm);
		entity.setOpiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa(opiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa);
		entity.setOpiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa(opiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa);
		entity.setOpiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia(opiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia);
		entity.setOpiskeluoikeusjaksoltaPuuttuuKoulutuskoodi(opiskeluoikeusjaksoltaPuuttuuKoulutuskoodi);
		entity.setOppilaitostunnus(oppilaitostunnus);		
		entity.setTietovarannonTietojenPaivitysLainMukaisellaAikataululla(tietovarannonTietojenPaivitysLainMukaisellaAikataululla);
		entity.setTutkintoIlmanKoulutuskoodia(tutkintoIlmanKoulutuskoodia);
		entity.setTutkintoopiskelijoidenLkm(tutkintoopiskelijoidenLkm);
		

        em.persist(entity);
		
        return entity;
    }
}