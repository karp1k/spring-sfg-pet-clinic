package springframework.guru.sfgpetclinic.petclinicdata.model;

import java.util.Set;

/**
 * @author kas
 */
public class Owner extends Person {


    private String address;
    private String city;
    private String phoneNumber;

    private Set<Pet> petSet;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Pet> getPetSet() {
        return petSet;
    }

    public void setPetSet(Set<Pet> petSet) {
        this.petSet = petSet;
    }


}
