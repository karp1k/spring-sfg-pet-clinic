package springframework.guru.sfgpetclinic.petclinicdata.model;

/**
 * @author kas
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
