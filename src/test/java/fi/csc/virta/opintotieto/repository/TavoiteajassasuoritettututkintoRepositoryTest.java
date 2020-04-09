package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Tavoiteajassasuoritettututkinto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class TavoiteajassasuoritettututkintoRepositoryTest extends BaseRepositoryTest<Tavoiteajassasuoritettututkinto> {

    @Autowired
    private TavoiteajassasuoritettututkintoRepository repository;

    @Test
    public void testStreamAll() throws Exception {
          assertStreamResults(Arrays.asList(
                        createEntity(  1L, new Date(), 2015, 31, 3, 0, 0, 0, 0, "ARCADA", 6  
																				, 1, "6121-18626", "6121", "18626", "02535",615,2, 5.0
																				,1,4, new Date(), 1.5, "721601"
																				, 2017, 60, 1.7 
																				,"fi","091"
																				,0,0,0,0,0
																				,0,0,0,0
																				,0,0,0
																				,"123456", new Date(), "NOVIA"
																				,0,0
																				,1,"A"
																				,25,1
																				),
                        createEntity(  2L, new Date(), 2015, 31, 3, 0, 0, 0, 0,  "ARCADA", 6 
																				, 1, "7121-28626", "7121", "28626", "02535",615,2, 5.0
																				,1,4, new Date(), 1.5, "631101"
																				, 2017, 210, 2.0 
																				,"fi","091"
																				,0,0,0,0,0	
																				,0,0,0,0
																				,0,0,0
																				,"123456", new Date(), "NOVIA"
																				,0,0
																				,1,"A"	
																				,25,1
																				),
						createEntity(  3L, new Date(), 2015, 31, 3, 0, 0, 0, 0,  "ARCADA", 6 
																				, 1, "8121-38626", "8121", "38626", "02535",615,2, 5.0
																				,1,4, new Date(), 1.5, "671112"
																				, 2017, 210, 3.0 
																				,"fi","091"
																				,0,0,0,0,0
																				,0,0,0,0
																				,0,0,0
																				,"123456", new Date(), "NOVIA"
																				,0,0
																				,1,"A"
																				,25,1
																				)
						),
						repository.streamAll()
										);
    }

    private Tavoiteajassasuoritettututkinto createEntity( long id, Date alkamispvm, int aloitusvuosi, int ika, int kaytetytlukukaudet,
                            int kaytetytpoissakoodi2kaudet, int kaytetytpoissakoodi2paivia,
                            int kaytetytpoissakoodi3kaudet, int kaytetytpoissakoodi3paivia,
														String kk, 
														int lasnaololukukaudet,
														int onaiempitutkinto, String opintosuoritusavain,String opiskelijaavain,
														String opiskeluoikeusavain, String oppilaitosnro, int paivia, int sukupuoli,
														double tavoiteaikavuosia,
														int tavoiteajassavalmistunut, int tavoitelukukaudet, Date tutkinnonsuorituspvm,
														double tutkintokerroin,
														String  tutkintokoodi, int tutkintovuosi, int vaadittuop, double vuosia,
														String xkoulutuskieli, String xkoulutuskunta, 
														int xonenintaan12kk, int xonryhmaa, int xonryhmab, int xonryhmac, int xonyli12kk,
														int xxalasnaololukukaudet, int xxblasnaolokuukaudet, int xxcpoissaololukukaudet, int xxdpoissaolokuukaudet,
														int xxetavoiteaikakuukausia, int xxfkaytettyaikakk, int xxgkokonaisaikakk,
														String xxhaiempitutkintokoodi, Date xxiaiempitutkintosuorituspvm, String xxjaiempikk, 
														int xxksiirtoopiskelija, int xxlavoimenvayla,
														int xxlkoulutustyyppi, String xxltutkintoryhma,
														int xxmikatutkinnonaloitusajankohtana, int xxmrahoituslahde

														) {

		Tavoiteajassasuoritettututkinto entity = new Tavoiteajassasuoritettututkinto();

		entity.setId(id);
		entity.setAlkamispvm(alkamispvm);
		entity.setAloitusvuosi(aloitusvuosi);
		entity.setIka(ika);
		entity.setKaytetytlukukaudet(kaytetytlukukaudet);

		entity.setKaytetytpoissakoodi2kaudet(kaytetytpoissakoodi2kaudet);		
		entity.setKaytetytpoissakoodi2paivia(kaytetytpoissakoodi2paivia);
		entity.setKaytetytpoissakoodi3kaudet(kaytetytpoissakoodi3kaudet);
		entity.setKaytetytpoissakoodi3paivia(kaytetytpoissakoodi3paivia);
		entity.setKk(kk);
		
		entity.setLasnaololukukaudet(lasnaololukukaudet);
		
		entity.setOnaiempitutkinto(onaiempitutkinto);
		entity.setOpintosuoritusavain(opintosuoritusavain);
		entity.setOpiskelijaavain(opiskelijaavain);
		entity.setOpiskeluoikeusavain(opiskeluoikeusavain);
		entity.setOppilaitosnro(oppilaitosnro) ;
		entity.setPaivia(paivia);
		entity.setSukupuoli(sukupuoli);		
		
		entity.setTavoiteaikavuosia(tavoiteaikavuosia);		
		
		entity.setTavoiteajassavalmistunut(tavoiteajassavalmistunut) ;
		entity.setTavoitelukukaudet(tavoitelukukaudet);
		entity.setTutkinnonsuorituspvm(tutkinnonsuorituspvm);
		
		entity.setTutkintokerroin(tutkintokerroin);
		
		entity.setTutkintokoodi(tutkintokoodi);
		entity.setTutkintovuosi(tutkintovuosi);
		entity.setVaadittuop(vaadittuop);
		entity.setVuosia(vuosia);
		
		entity.setXkoulutuskieli(xkoulutuskieli);
		entity.setXkoulutuskunta(xkoulutuskunta);
		entity.setXonenintaan12kk(xonenintaan12kk);
		entity.setXonryhmaa(xonryhmaa);
		entity.setXonryhmab(xonryhmab);
		entity.setXonryhmac(xonryhmac);
		entity.setXonyli12kk(xonyli12kk);
		
		entity.setXxalasnaololukukaudet(xxalasnaololukukaudet); 
		entity.setXxblasnaolokuukaudet(xxblasnaolokuukaudet);
		entity.setXxcpoissaololukukaudet(xxcpoissaololukukaudet);
		entity.setXxdpoissaolokuukaudet(xxdpoissaolokuukaudet);
		entity.setXxetavoiteaikakuukausia(xxetavoiteaikakuukausia);
		entity.setXxetavoiteaikakuukausia(xxetavoiteaikakuukausia);
		entity.setXxfkaytettyaikakk(xxfkaytettyaikakk);
		entity.setXxgkokonaisaikakk(xxgkokonaisaikakk);
		entity.setXxhaiempitutkintokoodi(xxhaiempitutkintokoodi);
		entity.setXxiaiempitutkintosuorituspvm(xxiaiempitutkintosuorituspvm);
		entity.setXxjaiempikk(xxjaiempikk);
		entity.setXxksiirtoopiskelija(xxksiirtoopiskelija);
		entity.setXxlavoimenvayla(xxlavoimenvayla);

		entity.setXxlkoulutustyyppi(xxlkoulutustyyppi);
		entity.setXxltutkintoryhma(xxltutkintoryhma);	
		
		/* 2020-09-04 */
		entity.setXxmikatutkinnonaloitusajankohtana(xxmikatutkinnonaloitusajankohtana);
		entity.setXxmrahoituslahde(xxmrahoituslahde);			

        em.persist(entity);
        return entity;
    }
}
