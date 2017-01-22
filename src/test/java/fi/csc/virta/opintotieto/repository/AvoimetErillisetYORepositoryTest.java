package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AvoimetErillisetYO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class AvoimetErillisetYORepositoryTest extends BaseRepositoryTest<AvoimetErillisetYO> {

    @Autowired
    private AvoimetErillisetYORepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L, 11, 11, 11, 11, 11, 11, "aa", "12345", 2016 ),
                        createEntity( 2L, 22, 22, 22, 22, 22, 22, "bb", "23456", 2016 ),
						createEntity( 3L, 33, 33, 33, 33, 33, 33, "cc", "34567", 2016 )
						),						
						repository.streamAll()
										);
    }

    private AvoimetErillisetYO createEntity( long id, int avomiehet, int avonaiset, int avotutkintomiehet, int avotutkintonaiset, int erillisetoikeudet, int erillisetopettajat, String kk, String organisaatiokoodi, int vuosi ) {
        		
		AvoimetErillisetYO entity = new AvoimetErillisetYO();
		
		entity.setId(id);
		entity.setAvoMiehet(avomiehet);
        entity.setAvoNaiset(avonaiset);
        entity.setAvoTutkintoMiehet(avotutkintomiehet);
        entity.setAvoTutkintoNaiset(avotutkintonaiset);        
        entity.setErillisetOikeudet(erillisetoikeudet);
        entity.setErillisetOpettajat(erillisetopettajat);
		entity.setKk(kk);
		entity.setOrganisaatioKoodi(organisaatiokoodi);
        entity.setVuosi(vuosi);		
		
        em.persist(entity);
		
        return entity;
    }
}