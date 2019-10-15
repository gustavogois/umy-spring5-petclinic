package gois.study.umyspring5petclinic.repositories;

import gois.study.umyspring5petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLasttName(String lastName);
}