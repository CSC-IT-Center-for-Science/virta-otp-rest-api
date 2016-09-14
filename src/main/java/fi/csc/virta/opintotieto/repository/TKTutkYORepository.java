package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKTutkYO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TKTutkYORepository extends OpintotietoRepository<TKTutkYO, Long> {

    @Override
    @Query(value = "select t from TKTutkYO t")
    Stream<TKTutkYO> streamAll();
}
