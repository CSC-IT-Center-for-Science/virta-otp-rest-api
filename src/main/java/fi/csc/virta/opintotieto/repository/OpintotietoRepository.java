package fi.csc.virta.opintotieto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.stream.Stream;

@NoRepositoryBean
public interface OpintotietoRepository<T, E extends Serializable> extends JpaRepository<T, E> {

    Stream<T> streamAll();
}
