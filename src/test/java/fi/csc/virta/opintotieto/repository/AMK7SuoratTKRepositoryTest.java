package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK7SuoratTK;
import fi.csc.virta.opintotieto.entity.AMKSuoratTKId;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class AMK7SuoratTKRepositoryTest extends BaseRepositoryTest<AMK7SuoratTK> {

    @Autowired
    private AMK7SuoratTKRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(createEntity("org1", 2016, 2, 2, 3),
                createEntity("org2", 2017, 3, 3, 4)), repository.streamAll());
    }

    private AMK7SuoratTK createEntity(String organisaatiokoodi, int vuosi, int koulutusala, int miehia, int naisia) {
        AMK7SuoratTK tk = new AMK7SuoratTK();
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