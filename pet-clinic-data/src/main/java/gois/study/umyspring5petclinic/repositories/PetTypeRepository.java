package gois.study.umyspring5petclinic.repositories;

import gois.study.umyspring5petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
