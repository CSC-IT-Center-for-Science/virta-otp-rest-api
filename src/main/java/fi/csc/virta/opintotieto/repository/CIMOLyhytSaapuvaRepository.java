package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.CIMOLyhytSaapuva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface CIMOLyhytSaapuvaRepository extends OpintotietoRepository<CIMOLyhytSaapuva, Long> {

    @Override
    @Query(value = "select t from CIMOLyhytSaapuva t")
    Stream<CIMOLyhytSaapuva> streamAll();
}
