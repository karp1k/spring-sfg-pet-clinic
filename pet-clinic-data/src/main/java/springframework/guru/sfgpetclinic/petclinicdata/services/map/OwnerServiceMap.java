package springframework.guru.sfgpetclinic.petclinicdata.services.map;

import springframework.guru.sfgpetclinic.petclinicdata.model.Owner;
import springframework.guru.sfgpetclinic.petclinicdata.services.CrudService;

import java.util.Set;

/**
 * @author kas
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

//    @Override
//    public Owner findByLastName(String lastName) {
//        return null;
//    }

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
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
