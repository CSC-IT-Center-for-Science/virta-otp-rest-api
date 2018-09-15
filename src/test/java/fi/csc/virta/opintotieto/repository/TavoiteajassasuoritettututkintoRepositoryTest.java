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
                        createEntity(  1L, new Date(), 2015, 31, 3, 0, 0, 0, 0, "ARCADA", 1, "6121-18626", "6121", "18626", "02535",615,2,1,4, new Date(), "721601", 2017, 60, 1.7 ),
                        createEntity(  2L, new Date(), 2015, 31, 3, 0, 0, 0, 0,  "ARCADA", 1, "7121-28626", "7121", "28626", "02535",615,2,1,4, new Date(), "631101", 2017, 210, 2.0 ),
						createEntity(  3L, new Date(), 2015, 31, 3, 0, 0, 0, 0,  "ARCADA", 1, "8121-38626", "8121", "38626", "02535",615,2,1,4, new Date(), "671112", 2017, 210, 3.0 )
						),
						repository.streamAll()
										);
    }

    private Tavoiteajassasuoritettututkinto createEntity( long id, Date alkamispvm, int aloitusvuosi, int ika, int kaytetytlukukaudet,
                            int kaytetytpoissakoodi2kaudet, int kaytetytpoissakoodi2paivia,
                            int kaytetytpoissakoodi3kaudet, int kaytetytpoissakoodi3paivia,
														String kk, int onaiempitutkinto, String opintosuoritusavain,String opiskelijaavain,
														String opiskeluoikeusavain, String oppilaitosnro, int paivia, int sukupuoli,
														int tavoiteajassavalmistunut, int tavoitelukukaudet, Date tutkinnonsuorituspvm,
														String  tutkintokoodi, int tutkintovuosi, int vaadittuop, double vuosia ) {

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
    entity.setOnaiempitutkinto(onaiempitutkinto);
    entity.setOpintosuoritusavain(opintosuoritusavain);
		entity.setOpiskelijaavain(opiskelijaavain);
    entity.setOpiskeluoikeusavain(opiskeluoikeusavain);
		entity.setOppilaitosnro(oppilaitosnro) ;
		entity.setPaivia(paivia);
		entity.setSukupuoli(sukupuoli);
		entity.setTavoiteajassavalmistunut(tavoiteajassavalmistunut) ;
		entity.setTavoitelukukaudet(tavoitelukukaudet);
		entity.setTutkinnonsuorituspvm(tutkinnonsuorituspvm);
		entity.setTutkintokoodi(tutkintokoodi);
		entity.setTutkintovuosi(tutkintovuosi);
		entity.setVaadittuop(vaadittuop);
		entity.setVuosia(vuosia);

        em.persist(entity);
        return entity;
    }
}
