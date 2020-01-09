package springframework.guru.sfgpetclinic.petclinicdata.services.map;

import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.petclinicdata.model.Owner;
import springframework.guru.sfgpetclinic.petclinicdata.services.OwnerService;
import springframework.guru.sfgpetclinic.petclinicdata.services.PetService;
import springframework.guru.sfgpetclinic.petclinicdata.services.PetTypeService;

import java.util.Set;

/**
 * @author kas
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            if (!object.getPetSet().isEmpty()) {
                object.getPetSet().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("PetType required");
                    }
                    if (pet.getId() == null) {
                        pet.setId(petService.save(pet).getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
