package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AvoimetErillisetYO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AvoimetErillisetYORepository extends OpintotietoRepository<AvoimetErillisetYO, Long> {

    @Override
    @Query(value = "select t from AvoimetErillisetYO t")
    Stream<AvoimetErillisetYO> streamAll();
}
