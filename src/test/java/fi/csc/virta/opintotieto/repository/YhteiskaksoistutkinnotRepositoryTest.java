package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Yhteiskaksoistutkinnot;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class YhteiskaksoistutkinnotRepositoryTest extends BaseRepositoryTest<Yhteiskaksoistutkinnot> {

    @Autowired
    private YhteiskaksoistutkinnotRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L, 25, "246", "ARCADA", "9", "AAA", "02535", 2, "101199", 2017),
                        createEntity( 2L, 25, "246", "ARCADA", "9", "BBB", "02535", 2, "101199", 2017),
						createEntity( 3L, 25, "246", "ARCADA", "9", "CCC", "02535", 2, "101199", 2017)
						),						
						repository.streamAll()
										);
    }

    private Yhteiskaksoistutkinnot createEntity( long id
												, int ika
												, String kansalaisuus
												, String kk 
												, String luokittelukoodi
												, String opiskelijaavain
												, String oppilaitoskoodi												
												, int sukupuoli
												, String tutkintokoodi
												, int tutkintovuosi ) {
        		
		Yhteiskaksoistutkinnot entity = new Yhteiskaksoistutkinnot();
		
		entity.setId(id);		
		entity.setIka(ika); 
		entity.setKansalaisuus(kansalaisuus); 
		entity.setKk(kk); 
		entity.setLuokittelukoodi(luokittelukoodi);
		entity.setOpiskelijaavain(opiskelijaavain); 
		entity.setOppilaitoskoodi(oppilaitoskoodi);  		 
		entity.setSukupuoli(sukupuoli); 
        entity.setTutkintokoodi(tutkintokoodi);	  
		entity.setTutkintovuosi(tutkintovuosi);  
				
        em.persist(entity);		
        return entity;
    }
}