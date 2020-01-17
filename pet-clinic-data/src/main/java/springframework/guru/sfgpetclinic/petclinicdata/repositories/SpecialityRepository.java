package springframework.guru.sfgpetclinic.petclinicdata.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.guru.sfgpetclinic.petclinicdata.model.Speciality;

/**
 * @author kas
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
