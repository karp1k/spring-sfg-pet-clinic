package springframework.guru.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.model.Speciality;

/**
 * @author kas
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
