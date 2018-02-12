package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.ViisViis2016;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface ViisViisRepository2016 extends OpintotietoRepository<ViisViis2016, Long> {

    @Override
    @Query(value = "select t from ViisViis2016 t")
    Stream<ViisViis2016> streamAll();
}
