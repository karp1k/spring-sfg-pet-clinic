package springframework.guru.sfgpetclinic.petclinicdata.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.petclinicdata.model.PetType;

/**
 * @author kas
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
