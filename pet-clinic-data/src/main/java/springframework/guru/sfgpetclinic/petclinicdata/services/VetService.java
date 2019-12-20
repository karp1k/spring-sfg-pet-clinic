package springframework.guru.sfgpetclinic.petclinicdata.services;

import springframework.guru.sfgpetclinic.petclinicdata.model.Vet;

import java.util.Set;

/**
 * @author kas
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
