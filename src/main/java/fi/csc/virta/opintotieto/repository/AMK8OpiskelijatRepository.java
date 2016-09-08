package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK8Opiskelijat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AMK8OpiskelijatRepository extends OpintotietoRepository<AMK8Opiskelijat, Long> {

    @Override
    @Query(value = "select t from AMK8Opiskelijat t")
    Stream<AMK8Opiskelijat> streamAll();
}
