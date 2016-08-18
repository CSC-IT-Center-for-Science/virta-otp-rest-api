package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK7SuoratTK;
import fi.csc.virta.opintotieto.entity.AMKSuoratTKId;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.util.Assert.isTrue;

public class AMK7SuoratTKRepositoryTest extends BaseRepositoryTest {

    @Autowired
    private AMK7SuoratTKRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        AMK7SuoratTK tk = createEntity("org1", 2016, 2, 2, 3);
        isTrue(repository.streamAll().allMatch(amk7SuoratTK ->
                        amk7SuoratTK.getId().equals(tk.getId()) &&
                                amk7SuoratTK.getMiehia().equals(tk.getMiehia()) &&
                                amk7SuoratTK.getNaisia().equals(tk.getNaisia())),
                "All matches");
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