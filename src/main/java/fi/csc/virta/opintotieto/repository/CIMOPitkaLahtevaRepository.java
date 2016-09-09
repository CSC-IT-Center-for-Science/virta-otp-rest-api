package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.CIMOPitkaLahteva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface CIMOPitkaLahtevaRepository extends OpintotietoRepository<CIMOPitkaLahteva, Long> {

    @Override
    @Query(value = "select t from CIMOPitkaLahteva t")
    Stream<CIMOPitkaLahteva> streamAll();
}
