package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Vet;
import com.gauro.sfgpetclinic.services.CrudService;
import com.gauro.sfgpetclinic.services.VetServices;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Chandra
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetServices {

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
       super.delete(object);

    }
    @Override
    public void deleteById(Long id) {
       super.deleteById(id);

    }





}
