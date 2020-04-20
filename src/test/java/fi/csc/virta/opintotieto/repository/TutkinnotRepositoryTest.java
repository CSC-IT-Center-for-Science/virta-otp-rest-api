package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Tutkinnot;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class TutkinnotRepositoryTest extends BaseRepositoryTest<Tutkinnot> {

    @Autowired
    private TutkinnotRepository repository;

    @Test
    public void testStreamAll() throws Exception {
          assertStreamResults(Arrays.asList(
                        createEntity( 	1L, 
										"12345", 
										1, 
										27, 
										"ARCADA", 
										"sv", 
										"123", 
										9, 
										"E19170", 
										"18030", 
										"19170", 
										"02535", 
										1, 
										0, 
										1, 
										1, 
										240, 
										2017, 
										new Date(), 
										"621702" 
										)
										,
                        createEntity(  2L,
										"12345", 
										1, 
										24, 
										"ARCADA", 
										"sv", 
										"123", 
										9, 
										"E18567", 
										"18037", 
										"18567", 
										"02535", 
										1, 
										0, 
										1, 
										1, 
										210, 
										2017, 
										new Date(), 
										"631101" 
																				
																				)
																				,
						createEntity(  3L,
										"12345", 
										1, 
										25, 
										"ARCADA", 
										"sv", 
										"123", 
										9, 
										"E18563", 
										"16944", 
										"18563", 
										"02535", 
										1, 
										0, 
										2, 
										1, 
										210, 
										2017, 
										new Date(), 
										"631101" 
																				)
						),
						repository.streamAll()
										);
    }

    private Tutkinnot createEntity( long		id, 
									String	 	alkuperainenorganisaatio, 
									int	 	avoinvayla, 
									int	 	ika, 
									String	 	kk, 
									String	 	koulutuskieli, 
									String	 	koulutuskunta, 
									int	 	luokittelu, 
									String	 	opintosuoritusavain, 
									String	 	opiskelijaavain, 
									String	 	opiskeluoikeusavain, 
									String	 	oppilaitosnro, 
									int	 	rahoituslahde, 
									int	 	siirtoopiskelija, 
									int	 	sukupuoli, 
									int	 	tkkoulutustyyppi, 
									int	 	tutkinnonlaajuusop, 
									int	 	tutkinnonsuoritusvuosi, 
									Date	 	tutkinnonsuorituspvm, 
									String	 	tutkintokoodi 
														) {

		Tutkinnot entity = new Tutkinnot();

		entity.setId(id);
		entity.setAlkuperainenorganisaatio(alkuperainenorganisaatio);
		entity.setAvoinvayla(avoinvayla);
		entity.setIka(ika);
		entity.setKk(kk);
		entity.setKoulutuskieli(koulutuskieli);
		entity.setKoulutuskunta(koulutuskunta);
		entity.setLuokittelu(luokittelu);
		entity.setOpintosuoritusavain(opintosuoritusavain);
		entity.setOpiskelijaavain(opiskelijaavain);
		entity.setOpiskeluoikeusavain(opiskeluoikeusavain);
		entity.setOppilaitosnro(oppilaitosnro);
		entity.setRahoituslahde(rahoituslahde);
		entity.setSiirtoopiskelija(siirtoopiskelija);
		entity.setSukupuoli(sukupuoli);
		entity.setTkkoulutustyyppi(tkkoulutustyyppi);
		entity.setTutkinnonlaajuusop(tutkinnonlaajuusop);
		entity.setTutkinnonsuoritusvuosi(tutkinnonsuoritusvuosi);
		entity.setTutkinnonsuorituspvm(tutkinnonsuorituspvm);
		entity.setTutkintokoodi(tutkintokoodi);

        em.persist(entity);
        return entity;
    }
}
