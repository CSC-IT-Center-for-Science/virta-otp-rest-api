package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.CIMOLyhytSaapuva;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class CIMOLyhytSaapuvaRepositoryTest extends CIMORepositoryTest<CIMOLyhytSaapuva> {

    @Autowired
    private CIMOLyhytSaapuvaRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L),
                        createEntity(2L)),
                repository.streamAll());
    }

    private CIMOLyhytSaapuva createEntity(long id) throws InstantiationException, IllegalAccessException {
        final CIMOLyhytSaapuva entity = super.createEntity(CIMOLyhytSaapuva.class, id);
        entity.setLahtomaa("lahtomaa" + id);
        return entity;
    }

}