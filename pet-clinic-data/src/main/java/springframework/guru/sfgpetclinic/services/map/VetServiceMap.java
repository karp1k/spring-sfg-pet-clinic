package springframework.guru.sfgpetclinic.services.map;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.model.Vet;
import springframework.guru.sfgpetclinic.services.SpecialityService;
import springframework.guru.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * @author kas
 */
@Service
@Profile({"default", "map"})
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
