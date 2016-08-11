package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK8SuoratTK;
import fi.csc.virta.opintotieto.entity.AMKSuoratTKId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AMK8SuoratTKRepository extends OpintotietoRepository<AMK8SuoratTK, AMKSuoratTKId> {

    @Override
    @Query(value = "select t from AMK8SuoratTK t")
    Stream<AMK8SuoratTK> streamAll();
}
