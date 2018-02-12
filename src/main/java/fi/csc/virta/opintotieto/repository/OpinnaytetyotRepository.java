package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Opinnaytetyot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface OpinnaytetyotRepository extends OpintotietoRepository<Opinnaytetyot, Long> {

    @Override
    @Query(value = "select t from Opinnaytetyot t")
    Stream<Opinnaytetyot> streamAll();
}
