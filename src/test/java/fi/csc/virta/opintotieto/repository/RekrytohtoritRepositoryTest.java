package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Rekrytohtorit;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class RekrytohtoritRepositoryTest extends BaseRepositoryTest<Rekrytohtorit> {

    @Autowired
    private RekrytohtoritRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L,"aa","12345", 2017, "12345", 2015 ),
                        createEntity( 2L,"bb","12345", 2017, "23456", 2013 ),
						createEntity( 3L,"cc","12345", 2017, "34567", 2011 )
						),						
						repository.streamAll()
										);
    }

    private Rekrytohtorit createEntity( long id,  String henkilonumero, String rekrykorkeakoulu, int tilastovuosi, String tohtoritutkintokorkeakoulu, int tohtoritutkintosuoritusvuosi ) {
        		
		Rekrytohtorit entity = new Rekrytohtorit();
		
		entity.setId(id);
		entity.setHenkilonumero(henkilonumero);
        entity.setRekrykorkeakoulu(rekrykorkeakoulu);
		entity.setTilastovuosi(tilastovuosi);		
        entity.setTohtoritutkintokorkeakoulu(tohtoritutkintokorkeakoulu);
        entity.setTohtoritutkintosuoritusvuosi(tohtoritutkintosuoritusvuosi);  
		 		
        em.persist(entity);		
        return entity;
    }
}