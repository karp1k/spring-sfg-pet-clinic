package springframework.guru.sfgpetclinic.petclinicdata.services.map;


import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.petclinicdata.model.Vet;
import springframework.guru.sfgpetclinic.petclinicdata.services.SpecialityService;
import springframework.guru.sfgpetclinic.petclinicdata.services.VetService;

import java.util.Set;

/**
 * @author kas
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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
        if (object != null) {
            if (!object.getSpecialitySet().isEmpty()) {
                object.getSpecialitySet().forEach(speciality -> {
                    if (speciality.getId() == null) {
                        speciality.setId(specialityService.save(speciality).getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }

    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
