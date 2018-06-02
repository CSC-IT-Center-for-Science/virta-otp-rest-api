package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Tavoiteajassasuoritettututkinto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TavoiteajassasuoritettututkintoRepository extends OpintotietoRepository<Tavoiteajassasuoritettututkinto, Long> {

    @Override
    @Query(value = "select t from Tavoiteajassasuoritettututkinto t")
    Stream<Tavoiteajassasuoritettututkinto> streamAll();
}
