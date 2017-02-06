package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Liikennevalot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface LiikennevalotRepository extends OpintotietoRepository<Liikennevalot, Long> {

    @Override
    @Query(value = "select t from Liikennevalot t")
    Stream<Liikennevalot> streamAll();
}
