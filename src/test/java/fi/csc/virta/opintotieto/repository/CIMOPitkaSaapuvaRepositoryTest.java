package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.CIMOPitkaSaapuva;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class CIMOPitkaSaapuvaRepositoryTest extends CIMORepositoryTest<CIMOPitkaSaapuva> {

    @Autowired
    private CIMOPitkaSaapuvaRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L),
                        createEntity(2L)),
                repository.streamAll());
    }

    private CIMOPitkaSaapuva createEntity(long id) throws InstantiationException, IllegalAccessException {
        final CIMOPitkaSaapuva entity = super.createEntity(CIMOPitkaSaapuva.class, id);
        entity.setLahtomaa("lahtomaa" + id);
        entity.setKansalaisuus("kansalaisuus" + id);
        entity.setLiikkuvuusohjelma("liikkuvuusohjelma" + id);
        return entity;
    }

}