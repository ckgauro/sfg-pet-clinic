package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Speciality;
import com.gauro.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Chandra
 */
@Service
@Profile({"default","map"})
public class SpecialtyMapService extends  AbstractMapService<Speciality,Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }
    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }






}
