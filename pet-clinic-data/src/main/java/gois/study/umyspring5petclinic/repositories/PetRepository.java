package gois.study.umyspring5petclinic.repositories;

import gois.study.umyspring5petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
