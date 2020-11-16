package com.gauro.sfgpetclinic.repositories;

import com.gauro.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chandra
 */
public interface VisitRepository extends CrudRepository<Visit,Long> {
}
