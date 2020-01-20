package springframework.guru.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author kas
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "types")
@Entity
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;
}
