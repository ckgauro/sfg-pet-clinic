package com.gauro.sfgpetclinic.repositories;

import com.gauro.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chandra
 */
public interface PetRepository extends CrudRepository<Pet,Long> {
}
