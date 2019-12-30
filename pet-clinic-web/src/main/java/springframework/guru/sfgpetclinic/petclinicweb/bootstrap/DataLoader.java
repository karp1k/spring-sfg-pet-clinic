package springframework.guru.sfgpetclinic.petclinicweb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springframework.guru.sfgpetclinic.petclinicdata.model.Owner;
import springframework.guru.sfgpetclinic.petclinicdata.model.PetType;
import springframework.guru.sfgpetclinic.petclinicdata.model.Vet;
import springframework.guru.sfgpetclinic.petclinicdata.services.OwnerService;
import springframework.guru.sfgpetclinic.petclinicdata.services.PetTypeService;
import springframework.guru.sfgpetclinic.petclinicdata.services.VetService;

/**
 * @author kas
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService,
                      VetService vetService,
                      PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType petType1 = new PetType();
        petType1.setName("dog");

        PetType savedPetType1 = petTypeService.save(petType1);

        PetType petType2 = new PetType();
        petType2.setName("cat");

        PetType savedPetType2 = petTypeService.save(petType2);


        Owner owner1 = new Owner();
        owner1.setFirstName("Anna");
        owner1.setLastName("Pickman");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Nick");
        owner2.setLastName("Freeman");

        ownerService.save(owner2);

        System.out.println("Load owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Lola");
        vet1.setLastName("Norfolk");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Cole");
        vet2.setLastName("Mamor");

        vetService.save(vet2);

        System.out.println("Load vets");

    }
}
