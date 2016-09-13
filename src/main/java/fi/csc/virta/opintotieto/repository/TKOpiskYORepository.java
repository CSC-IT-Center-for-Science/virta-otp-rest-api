package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKOpiskYO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TKOpiskYORepository extends OpintotietoRepository<TKOpiskYO, Long> {

    @Override
    @Query(value = "select t from TKOpiskYO t")
    Stream<TKOpiskYO> streamAll();
}
