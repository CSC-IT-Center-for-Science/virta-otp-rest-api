package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.CIMOPitkaSaapuva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface CIMOPitkaSaapuvaRepository extends OpintotietoRepository<CIMOPitkaSaapuva, Long> {

    @Override
    @Query(value = "select t from CIMOPitkaSaapuva t")
    Stream<CIMOPitkaSaapuva> streamAll();
}
