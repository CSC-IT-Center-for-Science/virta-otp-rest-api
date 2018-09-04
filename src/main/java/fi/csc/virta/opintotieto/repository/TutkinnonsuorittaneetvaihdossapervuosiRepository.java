package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Tutkinnonsuorittaneetvaihdossapervuosi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TutkinnonsuorittaneetvaihdossapervuosiRepository extends OpintotietoRepository<Tutkinnonsuorittaneetvaihdossapervuosi, Long> {

    @Override
    @Query(value = "select t from Tutkinnonsuorittaneetvaihdossapervuosi t")
    Stream<Tutkinnonsuorittaneetvaihdossapervuosi> streamAll();
}
