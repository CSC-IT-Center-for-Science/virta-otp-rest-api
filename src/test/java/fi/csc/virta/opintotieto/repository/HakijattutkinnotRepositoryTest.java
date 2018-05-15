package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Hakijattutkinnot;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class HakijattutkinnotRepositoryTest extends BaseRepositoryTest<Hakijattutkinnot> {

    @Autowired
    private HakijattutkinnotRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L,"01901", "1.2.3", new Date(), "505100"),
                        createEntity( 2L,"02535", "2.3.4", new Date(), "101010")						
						),						
						repository.streamAll()
										);
    }

    private Hakijattutkinnot createEntity( long id, String korkeakoulu, String oid, Date suorituspaivamaara, String tutkinto ) {
        		
		Hakijattutkinnot entity = new Hakijattutkinnot();
		
		entity.setId(id);	 
        entity.setKorkeakoulu(korkeakoulu);
		entity.setOid(oid);		
        entity.setSuorituspaivamaara(suorituspaivamaara);
        entity.setTutkinto(tutkinto);  
					
        em.persist(entity);		
        return entity;
    }
}