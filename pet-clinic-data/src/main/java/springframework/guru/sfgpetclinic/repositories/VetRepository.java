package springframework.guru.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.model.Vet;

/**
 * @author kas
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
