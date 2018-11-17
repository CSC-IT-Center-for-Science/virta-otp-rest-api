package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Lukuvuosimaksuvelvolliset;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class LukuvuosimaksuvelvollisetRepositoryTest extends BaseRepositoryTest<Lukuvuosimaksuvelvolliset> {

    @Autowired
    private LukuvuosimaksuvelvollisetRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L, 2016, "aa", 22, "752", "112345", "00110", 1, 2017 ),
                        createEntity( 2L, 2016, "bb", 23, "752", "112345", "00110", 1, 2017),
						createEntity( 3L, 2016, "cc", 24, "752", "112345", "00110", 2, 2017)
						),						
						repository.streamAll()
										);
    }

    private Lukuvuosimaksuvelvolliset createEntity( long id, int aloitusvuosi, String henkilo, int ika, String kansalaisuus, String koulutuskoodi, String oppilaitos,  int sukupuoli, int vuosi ) {
        		
		Lukuvuosimaksuvelvolliset entity = new Lukuvuosimaksuvelvolliset();
		
		entity.setId(id);
		
		entity.setAloitusvuosi(aloitusvuosi); 
		entity.setHenkilo(henkilo);
        entity.setIka(ika);
		entity.setKansalaisuus(kansalaisuus);		
        entity.setKoulutuskoodi(koulutuskoodi);
        entity.setOppilaitos(oppilaitos);  
		entity.setSukupuoli(sukupuoli);  
		entity.setVuosi(vuosi);  
				
        em.persist(entity);		
        return entity;
    }
}