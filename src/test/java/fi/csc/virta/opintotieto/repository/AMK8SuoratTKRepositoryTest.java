package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK8SuoratTK;
import fi.csc.virta.opintotieto.entity.AMKSuoratTKId;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class AMK8SuoratTKRepositoryTest extends BaseRepositoryTest<AMK8SuoratTK> {

    @Autowired
    private AMK8SuoratTKRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(createEntity("org1", 2016, 3, 10, 30),
                createEntity("org2", 2017, 4, 11, 30)), repository.streamAll());
    }

    private AMK8SuoratTK createEntity(String organisaatiokoodi, int vuosi, int koulutusala, int miehia, int naisia) {
        AMK8SuoratTK tk = new AMK8SuoratTK();
        AMKSuoratTKId id = new AMKSuoratTKId();
        id.setOrganisaatiokoodi(organisaatiokoodi);
        id.setVuosi(vuosi);
        id.setKoulutusala(koulutusala);
        tk.setId(id);
        tk.setMiehia(miehia);
        tk.setNaisia(naisia);
        em.persist(tk);
        return tk;
    }
}