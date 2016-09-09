package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.CIMOLyhytLahteva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface CIMOLyhytLahtevaRepository extends OpintotietoRepository<CIMOLyhytLahteva, Long> {

    @Override
    @Query(value = "select t from CIMOLyhytLahteva t")
    Stream<CIMOLyhytLahteva> streamAll();
}
