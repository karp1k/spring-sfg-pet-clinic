package springframework.guru.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"springframework.guru.sfgpetclinic"})
//@EnableJpaRepositories(basePackages = "springframework.guru.sfgpetclinic.petclinicdata.repositories")
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgPetClinicApplication.class, args);
    }

}
