package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Pet;
import com.gauro.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * @author Chandra
 */
public class PetServiceMap extends  AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
    @Override
    public void delete(Pet object) {
        super.delete(object);

    }




}
