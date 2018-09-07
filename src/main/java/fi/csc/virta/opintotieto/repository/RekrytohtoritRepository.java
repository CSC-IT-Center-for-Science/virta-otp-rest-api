package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Rekrytohtorit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface RekrytohtoritRepository extends OpintotietoRepository<Rekrytohtorit, Long> {

    @Override
    @Query(value = "select t from Rekrytohtorit t")
    Stream<Rekrytohtorit> streamAll();
}
