package springframework.guru.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.model.PetType;
import springframework.guru.sfgpetclinic.repositories.PetTypeRepository;
import springframework.guru.sfgpetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kas
 */
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypeSet = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypeSet::add);
        return petTypeSet;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
