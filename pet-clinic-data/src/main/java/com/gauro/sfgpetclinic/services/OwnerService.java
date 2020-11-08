package com.gauro.sfgpetclinic.services;

import com.gauro.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * @author Chandra
 */
public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
