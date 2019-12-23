package springframework.guru.sfgpetclinic.petclinicdata.services.map;

import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.petclinicdata.model.Pet;
import springframework.guru.sfgpetclinic.petclinicdata.services.CrudService;

import java.util.Set;

/**
 * @author kas
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
