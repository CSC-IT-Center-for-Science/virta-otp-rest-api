package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKOpiskAMK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TKOpiskAMKRepository extends OpintotietoRepository<TKOpiskAMK, Long> {

    @Override
    @Query(value = "select t from TKOpiskAMK t")
    Stream<TKOpiskAMK> streamAll();
}
