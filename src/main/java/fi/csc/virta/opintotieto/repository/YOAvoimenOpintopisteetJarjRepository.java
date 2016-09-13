package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.YOAvoimenOpintopisteetJarj;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface YOAvoimenOpintopisteetJarjRepository extends OpintotietoRepository<YOAvoimenOpintopisteetJarj,Long> {

    @Override
    @Query(value = "select o from YOAvoimenOpintopisteetJarj o")
    Stream<YOAvoimenOpintopisteetJarj> streamAll();
}
