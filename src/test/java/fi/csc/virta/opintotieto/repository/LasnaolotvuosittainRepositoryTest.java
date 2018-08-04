package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Lasnaolotvuosittain;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class LasnaolotvuosittainRepositoryTest extends BaseRepositoryTest<Lasnaolotvuosittain> {

    @Autowired
    private LasnaolotvuosittainRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity(  1L, "10045ARCADA","ARCADA",1,1,"BB","CC","02535", 2011),
                        createEntity(  2L, "10051ARCADA","ARCADA",0,1,"BB","CC","02535", 2011),
						createEntity(  3L, "10053ARCADA","ARCADA",1,0,"BB","CC","02535", 2011)
						),						
						repository.streamAll()
										);
    }

    private Lasnaolotvuosittain createEntity(    		long id
                                                      , String hkoodi
                                                      , String kk
                                                      , int lasnakevat                                                     
                                                      , int lasnasyys                                                     
                                                      , String opiskelijaavain
                                                      , String opiskeluoikeusavain
                                                      , String oppilaitos                                                      
                                                      , int vuosi ) {
        		
		Lasnaolotvuosittain entity = new Lasnaolotvuosittain();
		
		entity.setId(id);
		entity.setHkoodi(hkoodi);
		entity.setKk(kk);	
        entity.setLasnakevat(lasnakevat);		
        entity.setLasnasyys(lasnasyys);  		
        entity.setOpiskelijaavain(opiskelijaavain);	
        entity.setOpiskeluoikeusavain(opiskeluoikeusavain);         
        entity.setOppilaitos(oppilaitos);               
		entity.setVuosi(vuosi);			
 		
        em.persist(entity);		
        return entity;
    }
}