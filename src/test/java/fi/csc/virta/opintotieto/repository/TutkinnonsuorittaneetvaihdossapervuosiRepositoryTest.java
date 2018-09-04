package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Tutkinnonsuorittaneetvaihdossapervuosi;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class TutkinnonsuorittaneetvaihdossapervuosiRepositoryTest extends BaseRepositoryTest<Tutkinnonsuorittaneetvaihdossapervuosi> {

    @Autowired
    private TutkinnonsuorittaneetvaihdossapervuosiRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity(1,27,"156","246",2,19,45,"1","2","101","5","383316","1","02629","2",2003,new Date(),"631101")
                        
						),						
						repository.streamAll()
										);
    }

    private Tutkinnonsuorittaneetvaihdossapervuosi createEntity( long id, int ika, String kohdemaakoodi, String lahtomaakoodi, int liikkuvuudenkesto,
	 int liikkuvuudenkestoalle3kklkm, int liikkuvuudenkestoyli3kklkm, String liikkuvuudensuuntakoodi, String liikkuvuudentyyppikoodi, String liikkuvuusohjelmakoodi,String ohjauksenalakoodi,
	 String opiskelijaavain, String opiskeluoikeudentyyppikoodi, String oppilaitoskoodi, String sukupuolikoodi, int tutkinnonsuoritusvuosi, 
	 Date tutkinnonsuorituspaivamaara, String tutkintokoodi ) {
        		
		Tutkinnonsuorittaneetvaihdossapervuosi entity = new Tutkinnonsuorittaneetvaihdossapervuosi();
		
		entity.setId(id);
		entity.setIka(ika);
		entity.setKohdemaakoodi(kohdemaakoodi);
		entity.setLahtomaakoodi(lahtomaakoodi);		
        entity.setLiikkuvuudenkesto(liikkuvuudenkesto);
        entity.setLiikkuvuudenkestoalle3kklkm(liikkuvuudenkestoalle3kklkm);  
		entity.setLiikkuvuudenkestoyli3kklkm(liikkuvuudenkestoyli3kklkm);	
		entity.setLiikkuvuudensuuntakoodi(liikkuvuudensuuntakoodi);
        entity.setLiikkuvuudentyyppikoodi(liikkuvuudentyyppikoodi);
		entity.setLiikkuvuusohjelmakoodi(liikkuvuusohjelmakoodi);	
        entity.setOhjauksenalakoodi(ohjauksenalakoodi);		
        entity.setOpiskelijaavain(opiskelijaavain);
        entity.setOpiskeluoikeudentyyppikoodi(opiskeluoikeudentyyppikoodi);  
		entity.setOppilaitoskoodi(oppilaitoskoodi);
		entity.setSukupuolikoodi(sukupuolikoodi);		
        entity.setTutkinnonsuoritusvuosi(tutkinnonsuoritusvuosi);
        entity.setTutkinnonsuorituspaivamaara(tutkinnonsuorituspaivamaara);  
		entity.setTutkintokoodi(tutkintokoodi);
        em.persist(entity);		
		
        return entity;
    }
}


