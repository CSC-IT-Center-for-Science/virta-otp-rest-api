package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKOpiskEnnakko;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TKOpiskEnnakkoRepository extends OpintotietoRepository<TKOpiskEnnakko, Long> {

    @Override
    @Query(value = "select t from TKOpiskEnnakko t")
    Stream<TKOpiskEnnakko> streamAll();
}
