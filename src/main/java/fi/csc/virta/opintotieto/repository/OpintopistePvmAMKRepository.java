package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.OpintopistePvmAMK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface OpintopistePvmAMKRepository extends OpintotietoRepository<OpintopistePvmAMK, Long> {

    @Override
    @Query(value = "select o from OpintopistePvmAMK o")
    Stream<OpintopistePvmAMK> streamAll();
}
