package springframework.guru.sfgpetclinic.petclinicdata.services.map;

import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.petclinicdata.model.Speciality;
import springframework.guru.sfgpetclinic.petclinicdata.services.SpecialitiesService;

import java.util.Set;

/**
 * @author kas
 */
@Service
public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
