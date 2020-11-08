package com.gauro.sfgpetclinic.services;

import com.gauro.sfgpetclinic.model.Owner;


/**
 * @author Chandra
 */
public interface OwnerService  extends  CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
