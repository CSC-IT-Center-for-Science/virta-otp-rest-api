package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK8SuoratTK;
import fi.csc.virta.opintotieto.entity.AMKSuoratTKId;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.util.Assert.isTrue;

public class AMK8SuoratTKRepositoryTest extends BaseRepositoryTest {

    @Autowired
    private AMK8SuoratTKRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        AMK8SuoratTK tk = createEntity("org1", 2016, 3, 10, 30);
        isTrue(repository.streamAll().allMatch(amk7SuoratTK ->
                        amk7SuoratTK.getId().equals(tk.getId()) &&
                                amk7SuoratTK.getMiehia().equals(tk.getMiehia()) &&
                                amk7SuoratTK.getNaisia().equals(tk.getNaisia())),
                "All matches");
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