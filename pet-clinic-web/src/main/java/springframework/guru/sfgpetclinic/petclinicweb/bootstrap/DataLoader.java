package springframework.guru.sfgpetclinic.petclinicweb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springframework.guru.sfgpetclinic.petclinicdata.model.Owner;
import springframework.guru.sfgpetclinic.petclinicdata.model.Pet;
import springframework.guru.sfgpetclinic.petclinicdata.model.PetType;
import springframework.guru.sfgpetclinic.petclinicdata.model.Vet;
import springframework.guru.sfgpetclinic.petclinicdata.services.OwnerService;
import springframework.guru.sfgpetclinic.petclinicdata.services.PetTypeService;
import springframework.guru.sfgpetclinic.petclinicdata.services.VetService;

import java.time.LocalDate;

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
        owner1.setAddress("143503, Oktabrskay, 14");
        owner1.setCity("Severomorsk");
        owner1.setPhoneNumber("84951547931");

        Pet pet1 = new Pet();
        pet1.setName("Rich");
        pet1.setBirthDate(LocalDate.now());
        pet1.setPetType(petType1);
        pet1.setOwner(owner1);

        owner1.getPetSet().add(pet1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Nick");
        owner2.setLastName("Freeman");
        owner2.setAddress("142680, Lenina, 5");
        owner2.setCity("Tver");
        owner2.setPhoneNumber("84951532148");

        Pet pet2 = new Pet();
        pet2.setName("Lily");
        pet2.setOwner(owner2);
        pet2.setBirthDate(LocalDate.now());
        pet2.setPetType(petType2);

        owner2.getPetSet().add(pet2);

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
