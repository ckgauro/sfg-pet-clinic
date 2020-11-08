package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Vet;
import com.gauro.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * @author Chandra
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet,Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        delete(object);

    }
    @Override
    public void deleteById(Long id) {
        deleteById(id);

    }





}
