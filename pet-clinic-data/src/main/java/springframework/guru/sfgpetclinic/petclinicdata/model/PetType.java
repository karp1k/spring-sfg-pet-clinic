package springframework.guru.sfgpetclinic.petclinicdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author kas
 */
@Table(name = "types")
@Entity
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
