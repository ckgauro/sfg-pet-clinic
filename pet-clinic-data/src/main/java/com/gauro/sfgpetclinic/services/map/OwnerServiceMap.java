package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Owner;
import com.gauro.sfgpetclinic.services.CrudService;
import com.gauro.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Chandra
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }
    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
