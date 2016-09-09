package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.CIMOPitkaLahteva;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class CIMOPitkaLahtevaRepositoryTest extends CIMORepositoryTest<CIMOPitkaLahteva> {

    @Autowired
    private CIMOPitkaLahtevaRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L),
                        createEntity(2L)),
                repository.streamAll());
    }

    private CIMOPitkaLahteva createEntity(long id) throws InstantiationException, IllegalAccessException {
        final CIMOPitkaLahteva entity = super.createEntity(CIMOPitkaLahteva.class, id);
        entity.setKohdemaa("kohdemaa" + id);
        entity.setLiikkuvuusohjelma("liikkuvuusohjelma" + id);
        return entity;
    }

}