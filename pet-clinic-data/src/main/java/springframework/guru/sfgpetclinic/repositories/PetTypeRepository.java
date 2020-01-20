package springframework.guru.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.model.PetType;

/**
 * @author kas
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
