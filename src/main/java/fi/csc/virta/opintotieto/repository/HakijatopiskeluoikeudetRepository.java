package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Hakijatopiskeluoikeudet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface HakijatopiskeluoikeudetRepository extends OpintotietoRepository<Hakijatopiskeluoikeudet, Long> {

    @Override
    @Query(value = "select t from Hakijatopiskeluoikeudet t")
    Stream<Hakijatopiskeluoikeudet> streamAll();
}
