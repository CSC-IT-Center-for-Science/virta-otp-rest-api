package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Kansainvalisettutkinnot;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class KansainvalisettutkinnotRepositoryTest extends BaseRepositoryTest<Kansainvalisettutkinnot> {

    @Autowired
    private KansainvalisettutkinnotRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L, 5, "9","02535", "101199", 2017),
                        createEntity( 2L, 5, "9","02535", "101199", 2017),
						createEntity( 3L, 5, "9","02535", "101199", 2017)
						),						
						repository.streamAll()
										);
    }

    private Kansainvalisettutkinnot createEntity( long id, int kpl, String luokittelukoodi, String oppilaitos, String tutkintokoodi, int vuosi ) {
        		
		Kansainvalisettutkinnot entity = new Kansainvalisettutkinnot();
		
		entity.setId(id);		
		entity.setKpl(kpl); 
		entity.setLuokittelukoodi(luokittelukoodi);
		entity.setOppilaitos(oppilaitos);  		
        entity.setTutkintokoodi(tutkintokoodi);	  
		entity.setVuosi(vuosi);  
				
        em.persist(entity);		
        return entity;
    }
}