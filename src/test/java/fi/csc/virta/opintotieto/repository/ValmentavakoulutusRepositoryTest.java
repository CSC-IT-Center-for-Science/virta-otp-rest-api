package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Valmentavakoulutus;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class ValmentavakoulutusRepositoryTest extends BaseRepositoryTest<Valmentavakoulutus> {

    @Autowired
    private ValmentavakoulutusRepository repository;

    @Test
    public void testStreamAll() throws Exception {
          assertStreamResults(Arrays.asList(
		  
				createEntity( 1L, 1, 21, 2, "ARCADA", "101001", new Date(), new Date(), 1, "02535", new Date(), "ARCADA", new Date(), new Date(), 17, "02535" ),
				createEntity( 2L, 2, 22, 1, "ARCADA", "101002", new Date(), new Date(), 1, "02535", new Date(), "ARCADA", new Date(), new Date(), 17, "02535" )
				
						),
						repository.streamAll()
										);
    }

    private Valmentavakoulutus createEntity( long id,	
											 int atunniste,
											 int ika,
											 int sukupuoli,
											 String tkk,
											 String tkoulutuskoodi,	
											 
											 Date tooalkamispaivamaara,
											 Date toopaattymispaivamaara,	
											 
											 int tootyyppi,	
											 String toppilaitosnro,	
											 
											 Date ttutkintosuorituspvm,
											 
											 String vkk,	
											 
											 Date vooalkamispaivamaara,
											 Date voopaattymispaivamaara,	
											 
											 int vootyyppi,
											 String voppilaitosnro	)
														
														{

		Valmentavakoulutus entity = new Valmentavakoulutus();

					entity.setId(id);
					entity.setAtunniste(atunniste);
					entity.setIka(ika);
					entity.setSukupuoli(sukupuoli);
					entity.setTkk(tkk);
					entity.setTkoulutuskoodi(tkoulutuskoodi);
					entity.setTooalkamispaivamaara(tooalkamispaivamaara);
					entity.setToopaattymispaivamaara(toopaattymispaivamaara);
					entity.setTootyyppi(tootyyppi);
					entity.setToppilaitosnro(toppilaitosnro);
					 
					entity.setTtutkinnonsuorituspvm(ttutkintosuorituspvm);
					entity.setVkk(vkk);
					entity.setVooalkamispaivamaara(vooalkamispaivamaara);
					entity.setVoopaattymispaivamaara(voopaattymispaivamaara);
					entity.setVootyyppi(vootyyppi);
					entity.setVoppilaitosnro(voppilaitosnro);
					
        em.persist(entity);
        return entity;
    }
}
