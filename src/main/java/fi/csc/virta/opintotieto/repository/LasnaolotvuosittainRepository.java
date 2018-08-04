package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Lasnaolotvuosittain;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface LasnaolotvuosittainRepository extends OpintotietoRepository<Lasnaolotvuosittain, Long> {

    @Override
    @Query(value = "select t from Lasnaolotvuosittain t")
    Stream<Lasnaolotvuosittain> streamAll();
}
