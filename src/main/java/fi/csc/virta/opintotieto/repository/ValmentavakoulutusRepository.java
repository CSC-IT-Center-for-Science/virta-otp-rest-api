package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Valmentavakoulutus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface ValmentavakoulutusRepository extends OpintotietoRepository<Valmentavakoulutus, Long> {

    @Override
    @Query(value = "select t from Valmentavakoulutus t")
    Stream<Valmentavakoulutus> streamAll();
}
