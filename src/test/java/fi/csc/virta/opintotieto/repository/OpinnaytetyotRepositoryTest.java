package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Opinnaytetyot;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class OpinnaytetyotRepositoryTest extends BaseRepositoryTest<Opinnaytetyot> {

    @Autowired
    private OpinnaytetyotRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L, 11, 11, "aa", 11, 11, "12345", 2017 ),
                        createEntity( 2L, 22, 22, "bb", 22, 22, "23456", 2017 ),
						createEntity( 3L, 33, 33, "cc", 33, 33, "34567", 2017 )
						),						
						repository.streamAll()
										);
    }

    private Opinnaytetyot createEntity( long id, int eihankeistettuja, int hankeistettuja, String kk, int koulutustyyppi, int ohjausala, String organisaatio, int vuosi ) {
        		
		Opinnaytetyot entity = new Opinnaytetyot();
		
		entity.setId(id);
		entity.setEiHankeistettuja(eihankeistettuja);
        entity.setHankeistettuja(hankeistettuja);
		entity.setKk(kk);		
        entity.setKoulutustyyppi(koulutustyyppi);
        entity.setOhjausala(ohjausala);  
		entity.setOrganisaatio(organisaatio);
        entity.setVuosi(vuosi);				
        em.persist(entity);		
        return entity;
    }
}