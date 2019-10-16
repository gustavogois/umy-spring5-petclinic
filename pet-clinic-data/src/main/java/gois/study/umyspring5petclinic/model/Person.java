package gois.study.umyspring5petclinic.model;

import lombok.*;

import javax.persistence.MappedSuperclass;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    private String firstName;
    private String lasttName;

}
