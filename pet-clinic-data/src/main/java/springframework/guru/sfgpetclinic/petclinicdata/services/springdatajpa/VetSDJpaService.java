package springframework.guru.sfgpetclinic.petclinicdata.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.petclinicdata.model.Vet;
import springframework.guru.sfgpetclinic.petclinicdata.repositories.VetRepository;
import springframework.guru.sfgpetclinic.petclinicdata.services.VetService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kas
 */
@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vetSet = new HashSet<>();
        vetRepository.findAll().forEach(vetSet::add);
        return vetSet;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
