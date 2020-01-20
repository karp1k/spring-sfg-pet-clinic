package springframework.guru.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springframework.guru.sfgpetclinic.model.*;
import springframework.guru.sfgpetclinic.services.*;

import java.time.LocalDate;

/**
 * @author kas
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService,
                      VetService vetService,
                      PetTypeService petTypeService,
                      SpecialityService specialityService,
                      VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int countPetType = petTypeService.findAll().size();
        if (countPetType == 0) {
            loadData();
        }

    }

    private void loadData() {
        PetType petType1 = new PetType();
        petType1.setName("dog");

        petType1 = petTypeService.save(petType1);

        PetType petType2 = new PetType();
        petType2.setName("cat");

        petType2 = petTypeService.save(petType2);


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

        Visit pet2Visit = new Visit();
        pet2Visit.setPet(pet2);
        pet2Visit.setDate(LocalDate.now());
        pet2Visit.setDescription("Sneezy Kitty");

        visitService.save(pet2Visit);

        Speciality spec1 = new Speciality();
        spec1.setDescription("Radiology");

        Speciality spec2 = new Speciality();
        spec2.setDescription("Surgery");

        Speciality spec3 = new Speciality();
        spec3.setDescription("Dentistry");

        Speciality savedSpec1 = specialityService.save(spec1);
        Speciality savedSpec2 = specialityService.save(spec2);
        Speciality savedSpec3 = specialityService.save(spec3);

        Vet vet1 = new Vet();
        vet1.setFirstName("Lola");
        vet1.setLastName("Norfolk");
        vet1.getSpecialitySet().add(savedSpec1);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Cole");
        vet2.setLastName("Mamor");
        vet2.getSpecialitySet().add(savedSpec2);
        vet2.getSpecialitySet().add(savedSpec3);
        vetService.save(vet2);

        System.out.println("Load vets");
    }
}
