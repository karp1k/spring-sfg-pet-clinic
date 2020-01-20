package springframework.guru.sfgpetclinic.services;

import springframework.guru.sfgpetclinic.model.Owner;


/**
 * @author kas
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
