package springframework.guru.sfgpetclinic.petclinicdata.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.petclinicdata.model.Vet;

/**
 * @author kas
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
