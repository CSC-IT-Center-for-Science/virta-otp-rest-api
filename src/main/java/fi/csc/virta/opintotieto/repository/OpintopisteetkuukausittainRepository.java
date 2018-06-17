package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Opintopisteetkuukausittain;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface OpintopisteetkuukausittainRepository extends OpintotietoRepository<Opintopisteetkuukausittain, Long> {

    @Override
    @Query(value = "select t from Opintopisteetkuukausittain t")
    Stream<Opintopisteetkuukausittain> streamAll();
}
