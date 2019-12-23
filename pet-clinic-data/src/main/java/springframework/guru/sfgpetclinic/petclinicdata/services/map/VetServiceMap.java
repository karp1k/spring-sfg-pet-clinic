package springframework.guru.sfgpetclinic.petclinicdata.services.map;


import springframework.guru.sfgpetclinic.petclinicdata.model.Vet;
import springframework.guru.sfgpetclinic.petclinicdata.services.VetService;

import java.util.Set;

/**
 * @author kas
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
