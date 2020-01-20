package springframework.guru.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.model.Visit;
import springframework.guru.sfgpetclinic.repositories.VisitRepository;
import springframework.guru.sfgpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kas
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visitSet = new HashSet<>();
        visitRepository.findAll().forEach(visitSet::add);
        return visitSet;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
