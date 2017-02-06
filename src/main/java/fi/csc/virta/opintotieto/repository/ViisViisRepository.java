package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.ViisViis;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface ViisViisRepository extends OpintotietoRepository<ViisViis, Long> {

    @Override
    @Query(value = "select t from ViisViis t")
    Stream<ViisViis> streamAll();
}
