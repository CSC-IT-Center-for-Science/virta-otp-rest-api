package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.OKMAloittaneetOpintopisteetYO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface OKMAloittaneetOpintopisteetYORepository extends OpintotietoRepository<OKMAloittaneetOpintopisteetYO, Long> {

    @Override
    @Query(value = "select t from OKMAloittaneetOpintopisteetYO t")
    Stream<OKMAloittaneetOpintopisteetYO> streamAll();
}
