package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.OpintopistePvmYO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface OpintopistePvmYORepository extends OpintotietoRepository<OpintopistePvmYO, Long> {

    @Override
    @Query(value = "select o from OpintopistePvmYO o")
    Stream<OpintopistePvmYO> streamAll();
}
