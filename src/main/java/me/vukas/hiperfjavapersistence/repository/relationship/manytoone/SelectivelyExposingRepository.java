package me.vukas.hiperfjavapersistence.repository.relationship.manytoone;

import java.io.Serializable;
import java.util.Optional;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

/**
 * This is not repo inteface (so tell spring not to instantiate it). It will be used only for
 * extending
 * @param <T>
 * @param <ID>
 */
@NoRepositoryBean
public interface SelectivelyExposingRepository<T, ID extends Serializable> extends
    Repository<T, ID> {

  Optional<T> findById(ID id);

  <S extends T> S save(S entity);
}
