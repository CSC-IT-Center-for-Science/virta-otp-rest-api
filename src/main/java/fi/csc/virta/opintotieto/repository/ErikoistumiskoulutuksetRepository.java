package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Erikoistumiskoulutukset;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface ErikoistumiskoulutuksetRepository extends OpintotietoRepository<Erikoistumiskoulutukset, Long> {

    @Override
    @Query(value = "select t from Erikoistumiskoulutukset t")
    Stream<Erikoistumiskoulutukset> streamAll();
}
