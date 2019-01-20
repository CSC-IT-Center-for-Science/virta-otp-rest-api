package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Kansainvalisettutkinnot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface KansainvalisettutkinnotRepository extends OpintotietoRepository<Kansainvalisettutkinnot, Long> {

    @Override
    @Query(value = "select t from Kansainvalisettutkinnot t")
    Stream<Kansainvalisettutkinnot> streamAll();
}
