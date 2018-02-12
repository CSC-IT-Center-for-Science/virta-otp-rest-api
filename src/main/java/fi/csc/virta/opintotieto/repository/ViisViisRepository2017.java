package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.ViisViis2017;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface ViisViisRepository2017 extends OpintotietoRepository<ViisViis2017, Long> {

    @Override
    @Query(value = "select t from ViisViis2017 t")
    Stream<ViisViis2017> streamAll();
}
