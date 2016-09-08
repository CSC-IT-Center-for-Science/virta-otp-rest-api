package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK7Opiskelijat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AMK7OpiskelijatRepository extends OpintotietoRepository<AMK7Opiskelijat, Long> {

    @Override
    @Query(value = "select t from AMK7Opiskelijat t")
    Stream<AMK7Opiskelijat> streamAll();
}
