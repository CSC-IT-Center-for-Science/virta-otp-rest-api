package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKTutkintoEnnakko;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TKTutkintoEnnakkoRepository extends OpintotietoRepository<TKTutkintoEnnakko, Long> {

    @Override
    @Query(value = "select t from TKTutkintoEnnakko t")
    Stream<TKTutkintoEnnakko> streamAll();
}
