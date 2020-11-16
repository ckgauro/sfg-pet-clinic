package com.gauro.sfgpetclinic.repositories;

import com.gauro.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chandra
 */
public interface OwnerRepository  extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
