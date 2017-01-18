package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.YO6AvoimetErillisetSummataulukko;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface YO6AvoimetErillisetSummataulukkoRepository extends OpintotietoRepository<YO6AvoimetErillisetSummataulukko, Long> {

    @Override
    @Query(value = "select o from YO6AvoimetErillisetSummataulukko o")
    Stream<YO6AvoimetErillisetSummataulukko> streamAll();
}
