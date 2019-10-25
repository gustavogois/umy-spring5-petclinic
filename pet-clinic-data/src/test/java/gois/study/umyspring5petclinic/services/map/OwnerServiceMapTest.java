package gois.study.umyspring5petclinic.services.map;

import gois.study.umyspring5petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    final Long ownerId = 1L;

    final String lastName = "Gois";

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
        ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerServiceMap.findAll();

        assertEquals(1, ownerSet.size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);

        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));

        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;

        Owner owner2 = Owner.builder().id(id).build();

        Owner ownerSaved = ownerServiceMap.save(owner2);

        assertEquals(id, ownerSaved.getId());
    }

    @Test
    void saveNoId() {
        Owner ownerSaved = ownerServiceMap.save(Owner.builder().build());

        assertNotNull(ownerSaved);
        assertNotNull(ownerSaved.getId());
    }

    @Test
    void findById() {
        Owner ownerById = ownerServiceMap.findById(ownerId);

        assertEquals(ownerId, ownerById.getId());
    }

    @Test
    void findByLastName() {
        Owner gois = ownerServiceMap.findByLastName(lastName);

        assertNotNull(gois);

        assertEquals(lastName, gois.getLastName());
    }

    @Test
    void findByLastNameNotFound() {
        Owner foo = ownerServiceMap.findByLastName("foo");

        assertNull(foo);
    }
}