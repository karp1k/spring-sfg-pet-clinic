package springframework.guru.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.model.Pet;

/**
 * @author kas
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
