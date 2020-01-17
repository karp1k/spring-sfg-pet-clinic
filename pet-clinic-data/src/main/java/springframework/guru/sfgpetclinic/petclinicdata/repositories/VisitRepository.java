package springframework.guru.sfgpetclinic.petclinicdata.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.petclinicdata.model.Visit;

/**
 * @author kas
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
