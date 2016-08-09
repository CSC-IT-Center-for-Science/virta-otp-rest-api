package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMKOpintopiste;
import fi.csc.virta.opintotieto.entity.AMKOpintopisteId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AMKOpintopisteRepository extends OpintotietoRepository<AMKOpintopiste, AMKOpintopisteId> {

    @Override
    @Query(value = "select o from AMKOpintopiste o")
    Stream<AMKOpintopiste> streamAll();
}
