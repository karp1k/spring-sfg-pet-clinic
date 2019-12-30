package springframework.guru.sfgpetclinic.petclinicdata.model;

import java.util.Set;

/**
 * @author kas
 */
public class Vet extends Person {

    private Set<Speciality> specialitySet;


    public Set<Speciality> getSpecialitySet() {
        return specialitySet;
    }

    public void setSpecialitySet(Set<Speciality> specialitySet) {
        this.specialitySet = specialitySet;
    }
}
