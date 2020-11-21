package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Chandra
 */
class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    private Long ownerId = 1L;

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(),
                new PetServiceMap());
        ownerServiceMap.save(Owner.builder().id(ownerId).build());
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void findAll() {
        Set<Owner> ownerSet=ownerServiceMap.findAll();
        assertEquals(1,ownerSet.size());
        //6
    }

    @Test
    void findById() {

    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByLastName() {
    }

    @Test
    void testToString() {
    }
}