package springframework.guru.sfgpetclinic.petclinicweb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springframework.guru.sfgpetclinic.petclinicdata.model.Owner;
import springframework.guru.sfgpetclinic.petclinicdata.model.Vet;
import springframework.guru.sfgpetclinic.petclinicdata.services.OwnerService;
import springframework.guru.sfgpetclinic.petclinicdata.services.VetService;

/**
 * @author kas
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Anna");
        owner1.setLastName("Pickman");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Nick");
        owner2.setLastName("Freeman");

        ownerService.save(owner2);

        System.out.println("Load owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Lola");
        vet1.setLastName("Norfolk");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Cole");
        vet2.setLastName("Mamor");

        vetService.save(vet2);

        System.out.println("Load vets");

    }
}
