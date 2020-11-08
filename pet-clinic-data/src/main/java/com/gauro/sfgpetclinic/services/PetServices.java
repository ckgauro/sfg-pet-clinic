package com.gauro.sfgpetclinic.services;

import com.gauro.sfgpetclinic.model.Owner;
import com.gauro.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * @author Chandra
 */
public interface PetServices {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
