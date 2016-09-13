package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.YOOpintopiste;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface YOOpintopisteRepository extends OpintotietoRepository<YOOpintopiste, Long> {

    @Override
    @Query(value = "select o from YOOpintopiste o")
    Stream<YOOpintopiste> streamAll();
}
