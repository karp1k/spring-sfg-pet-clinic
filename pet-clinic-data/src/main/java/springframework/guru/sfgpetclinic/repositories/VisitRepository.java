package springframework.guru.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.model.Visit;

/**
 * @author kas
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
