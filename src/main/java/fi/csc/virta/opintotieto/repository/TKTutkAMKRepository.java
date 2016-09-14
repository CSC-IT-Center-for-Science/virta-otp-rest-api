package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKTutkAMK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TKTutkAMKRepository extends OpintotietoRepository<TKTutkAMK, Long> {

    @Override
    @Query(value = "select t from TKTutkAMK t")
    Stream<TKTutkAMK> streamAll();
}
