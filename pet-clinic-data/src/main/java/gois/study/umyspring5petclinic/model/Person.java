package gois.study.umyspring5petclinic.model;

import lombok.*;

import javax.persistence.MappedSuperclass;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    private String firstName;
    private String lasttName;

    public Person(Long id, String firstName, String lasttName) {
        super(id);
        this.firstName = firstName;
        this.lasttName = lasttName;
    }
}
