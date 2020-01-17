package springframework.guru.sfgpetclinic.petclinicdata.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.petclinicdata.model.Owner;

/**
 * @author kas
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
