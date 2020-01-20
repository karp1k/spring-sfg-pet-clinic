package springframework.guru.sfgpetclinic.petclinicdata.services.map;

import org.springframework.stereotype.Service;
import springframework.guru.sfgpetclinic.petclinicdata.model.Visit;
import springframework.guru.sfgpetclinic.petclinicdata.services.VisitService;

import java.util.Set;

/**
 * @author kas
 */
@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {


    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        if (object.getPet() == null || object.getPet().getId() == null
                || object.getPet().getOwner() == null || object.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid visit");
        }
        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
