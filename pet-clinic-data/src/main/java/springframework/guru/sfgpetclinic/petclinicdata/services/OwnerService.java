package springframework.guru.sfgpetclinic.petclinicdata.services;

import springframework.guru.sfgpetclinic.petclinicdata.model.Owner;

import java.util.Set;

/**
 * @author kas
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner fingById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
