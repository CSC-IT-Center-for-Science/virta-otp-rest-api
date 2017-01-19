package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.YO6AvoimetErillisetSummataulukko;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class YO6AvoimetErillisetSummataulukkoRepositoryTest extends BaseRepositoryTest<YO6AvoimetErillisetSummataulukko> {

    @Autowired
    private YO6AvoimetErillisetSummataulukkoRepository repository;

    @Test
    public void testStreamAll() throws Exception {
        assertStreamResults(Arrays.asList(
                        createEntity(1L, "kk", 2016, 11, 22, 33,
                               44, 66),
                        createEntity(2L, "kk2", 2016, 8, 23, 66,
                                55, 0)),
                repository.streamAll());
    }

    private YO6AvoimetErillisetSummataulukko createEntity(long id,String kk, Integer vuosi, Integer avoTutkintoMiehet, Integer avoTutkintoNaiset, Integer avoMiehet, Integer avoNaiset, Integer erillisetOikeudet, Integer erillisetOpettajat) {
        YO6AvoimetErillisetSummataulukko entity = new YO6AvoimetErillisetSummataulukko();
        entity.setId(id);
        entity.setKk(kk);
        entity.setVuosi(vuosi);
        entity.setAvoTutkintoMiehet(avoTutkintoMiehet);
        entity.setAvoTutkintoNaiset(avoTutkintoNaiset);
        entity.setAvoMiehet(avoMiehet);
        entity.setAvoNaiset(avoNaiset);
        entity.setErillisetOikeudet(erillisetOikeudet);
        entity.setErillisetOpettajat(erillisetOpettajat);
        em.persist(entity);
        return entity;
    }
}