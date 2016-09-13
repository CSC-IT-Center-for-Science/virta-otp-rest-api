package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Uraseuranta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface UraseurantaRepository extends OpintotietoRepository<Uraseuranta, Long> {

    @Override
    @Query(value = "select o from Uraseuranta o")
    Stream<Uraseuranta> streamAll();
}
