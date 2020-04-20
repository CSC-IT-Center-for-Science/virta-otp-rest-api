package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Tutkinnot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TutkinnotRepository extends OpintotietoRepository<Tutkinnot, Long> {

    @Override
    @Query(value = "select t from Tutkinnot t")
    Stream<Tutkinnot> streamAll();
}
