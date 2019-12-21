package springframework.guru.sfgpetclinic.petclinicdata.services;

import springframework.guru.sfgpetclinic.petclinicdata.model.Owner;


/**
 * @author kas
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
