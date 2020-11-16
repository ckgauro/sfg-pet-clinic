package com.gauro.sfgpetclinic.repositories;

import com.gauro.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chandra
 */
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
