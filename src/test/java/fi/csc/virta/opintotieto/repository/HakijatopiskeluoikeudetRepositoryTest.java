package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Hakijatopiskeluoikeudet;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class HakijatopiskeluoikeudetRepositoryTest extends BaseRepositoryTest<Hakijatopiskeluoikeudet> {

    @Autowired
    private HakijatopiskeluoikeudetRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L, new Date(), "01901", "1.2.3", new Date(), "505100"),
                        createEntity( 2L, new Date(), "02535", "2.3.4", new Date(), "101010")						
						),						
						repository.streamAll()
										);
    }

    private Hakijatopiskeluoikeudet createEntity( long id, Date alkamispaivamaara, String korkeakoulu, String oid, Date paattymispaivamaara, String tavoitetutkinto ) {
        		
		Hakijatopiskeluoikeudet entity = new Hakijatopiskeluoikeudet();
		
		entity.setId(id);
		entity.setAlkamispaivamaara(alkamispaivamaara);
        entity.setKorkeakoulu(korkeakoulu);
		entity.setOid(oid);		
        entity.setPaattymispaivamaara(paattymispaivamaara);
        entity.setTavoitetutkinto(tavoitetutkinto);  
					
        em.persist(entity);		
        return entity;
    }
}