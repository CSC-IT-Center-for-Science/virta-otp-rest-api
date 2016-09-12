package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKEriopePatevyydet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TKEriopePatevyydetRepository extends OpintotietoRepository<TKEriopePatevyydet, Long> {

    @Override
    @Query(value = "select t from TKEriopePatevyydet t")
    Stream<TKEriopePatevyydet> streamAll();
}
