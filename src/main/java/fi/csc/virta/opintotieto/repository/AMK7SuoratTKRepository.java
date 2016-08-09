package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK7SuoratTK;
import fi.csc.virta.opintotieto.entity.AMK7SuoratTKId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AMK7SuoratTKRepository extends OpintotietoRepository<AMK7SuoratTK, AMK7SuoratTKId> {

    @Override
    @Query(value = "select t from AMK7SuoratTK t")
    Stream<AMK7SuoratTK> streamAll();
}
