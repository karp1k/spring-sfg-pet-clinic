package springframework.guru.sfgpetclinic.petclinicdata.services;

import springframework.guru.sfgpetclinic.petclinicdata.model.Pet;

import java.util.Set;

/**
 * @author kas
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
