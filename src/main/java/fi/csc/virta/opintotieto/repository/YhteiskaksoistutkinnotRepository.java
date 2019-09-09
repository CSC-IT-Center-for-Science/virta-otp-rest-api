package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Yhteiskaksoistutkinnot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface YhteiskaksoistutkinnotRepository extends OpintotietoRepository<Yhteiskaksoistutkinnot, Long> {

    @Override
    @Query(value = "select t from Yhteiskaksoistutkinnot t")
    Stream<Yhteiskaksoistutkinnot> streamAll();
}
