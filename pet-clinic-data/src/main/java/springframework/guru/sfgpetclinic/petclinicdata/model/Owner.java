package springframework.guru.sfgpetclinic.petclinicdata.model;

import java.util.Set;

/**
 * @author kas
 */
public class Owner extends Person {

    private Set<Pet> petSet;

    public Set<Pet> getPetSet() {
        return petSet;
    }

    public void setPetSet(Set<Pet> petSet) {
        this.petSet = petSet;
    }
}
