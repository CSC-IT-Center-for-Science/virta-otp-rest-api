package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.CIMOLyhytLahteva;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class CIMOLyhytLahtevaRepositoryTest extends CIMORepositoryTest<CIMOLyhytLahteva> {

    @Autowired
    private CIMOLyhytLahtevaRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L),
                        createEntity(2L)),
                repository.streamAll());
    }

    private CIMOLyhytLahteva createEntity(long id) throws InstantiationException, IllegalAccessException {
        final CIMOLyhytLahteva entity = super.createEntity(CIMOLyhytLahteva.class, id);
        entity.setKohdemaa("kohdemaa" + id);
        return entity;
    }


}