package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.OpettajaPatevyydet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface OpettajaPatevyydetRepository extends OpintotietoRepository<OpettajaPatevyydet, Long> {

    @Override
    @Query(value = "select o from OpettajaPatevyydet o")
    Stream<OpettajaPatevyydet> streamAll();
}
