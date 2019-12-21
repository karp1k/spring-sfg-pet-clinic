package springframework.guru.sfgpetclinic.petclinicdata.services;

import java.util.Set;

/**
 * @author kas
 */
public interface CrudService<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
