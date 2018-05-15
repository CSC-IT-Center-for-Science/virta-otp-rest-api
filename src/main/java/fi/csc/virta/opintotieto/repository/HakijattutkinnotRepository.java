package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Hakijattutkinnot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface HakijattutkinnotRepository extends OpintotietoRepository<Hakijattutkinnot, Long> {

    @Override
    @Query(value = "select t from Hakijattutkinnot t")
    Stream<Hakijattutkinnot> streamAll();
}
