package com.gauro.sfgpetclinic.services;

import com.gauro.sfgpetclinic.model.Pet;
import com.gauro.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * @author Chandra
 */
public interface VetServices {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
