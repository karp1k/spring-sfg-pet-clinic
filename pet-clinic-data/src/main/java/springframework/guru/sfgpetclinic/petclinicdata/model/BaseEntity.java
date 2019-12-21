package springframework.guru.sfgpetclinic.petclinicdata.model;

import java.io.Serializable;

/**
 * @author kas
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
