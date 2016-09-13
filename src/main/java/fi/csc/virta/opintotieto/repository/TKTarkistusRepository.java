package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKTarkistus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TKTarkistusRepository extends OpintotietoRepository<TKTarkistus, Long> {

    @Override
    @Query(value = "select o from TKTarkistus o")
    Stream<TKTarkistus> streamAll();
}
