package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMKAvoimenOpintopisteetJarj;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AMKAvoimenOpintopisteetJarjRepository extends OpintotietoRepository<AMKAvoimenOpintopisteetJarj,Long> {

    @Override
    @Query(value = "select o from AMKAvoimenOpintopisteetJarj o")
    Stream<AMKAvoimenOpintopisteetJarj> streamAll();
}
