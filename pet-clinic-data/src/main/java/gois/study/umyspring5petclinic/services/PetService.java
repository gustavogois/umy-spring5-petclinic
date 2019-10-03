package gois.study.umyspring5petclinic.services;

import gois.study.umyspring5petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();
}
