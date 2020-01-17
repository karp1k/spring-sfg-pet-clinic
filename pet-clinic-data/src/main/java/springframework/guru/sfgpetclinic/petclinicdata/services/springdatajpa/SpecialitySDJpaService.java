package springframework.guru.sfgpetclinic.petclinicdata.services.springdatajpa;

import springframework.guru.sfgpetclinic.petclinicdata.model.Speciality;
import springframework.guru.sfgpetclinic.petclinicdata.repositories.SpecialityRepository;
import springframework.guru.sfgpetclinic.petclinicdata.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kas
 */
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialitySet = new HashSet<>();
        specialityRepository.findAll().forEach(specialitySet::add);
        return specialitySet;
    }

    @Override
    public Speciality findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}
