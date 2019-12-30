package springframework.guru.sfgpetclinic.petclinicdata.services.map;

import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.petclinicdata.model.PetType;
import springframework.guru.sfgpetclinic.petclinicdata.services.PetTypeService;

import java.util.Set;

/**
 * @author kas
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);

    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
