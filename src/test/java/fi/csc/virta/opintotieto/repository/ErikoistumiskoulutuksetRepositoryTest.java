package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Erikoistumiskoulutukset;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class ErikoistumiskoulutuksetRepositoryTest extends BaseRepositoryTest<Erikoistumiskoulutukset> {

    @Autowired
    private ErikoistumiskoulutuksetRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1,"048",60,"8",new Date(),"02509","1"),
                        createEntity( 2,"024",18,"2",new Date(),"02535","2")
						),						
						repository.streamAll()
										);
    }

    private Erikoistumiskoulutukset createEntity( long id, String erikoistumiskoulutuskoodi, int ika, String ohjauksenalakoodi, Date opiskeluoikeudenalkamispaivamaara, String oppilaitoskoodi, String sukupuolikoodi ) {
        		
		Erikoistumiskoulutukset entity = new Erikoistumiskoulutukset();
		
		entity.setId(id);
		entity.setErikoistumiskoulutuskoodi(erikoistumiskoulutuskoodi);
        entity.setIka(ika);
		entity.setOhjauksenalakoodi(ohjauksenalakoodi);		
        entity.setOpiskeluoikeudenalkamispaivamaara(opiskeluoikeudenalkamispaivamaara);
        entity.setOppilaitoskoodi(oppilaitoskoodi);  
		entity.setSukupuolikoodi(sukupuolikoodi);	
		
        em.persist(entity);		
		
        return entity;
    }
}


