package springframework.guru.sfgpetclinic.petclinicdata.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.petclinicdata.model.Pet;

/**
 * @author kas
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
