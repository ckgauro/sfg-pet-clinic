package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Owner;
import com.gauro.sfgpetclinic.services.CrudService;
import com.gauro.sfgpetclinic.services.OwnerService;

import java.util.Set;

/**
 * @author Chandra
 */
public class OwnerMapService  extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
    @Override
    public Owner findById(Long id) {
        return  this.findById(id);
    }
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
    @Override
    public void delete(Owner object) {
        this.delete(object);

    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }






}
