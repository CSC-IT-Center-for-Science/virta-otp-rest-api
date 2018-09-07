package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Lukuvuosimaksuvelvolliset;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface LukuvuosimaksuvelvollisetRepository extends OpintotietoRepository<Lukuvuosimaksuvelvolliset, Long> {

    @Override
    @Query(value = "select t from Lukuvuosimaksuvelvolliset t")
    Stream<Lukuvuosimaksuvelvolliset> streamAll();
}
