package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Speciality;
import com.gauro.sfgpetclinic.model.Vet;
import com.gauro.sfgpetclinic.services.SpecialtyService;
import com.gauro.sfgpetclinic.services.VetServices;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Chandra
 */
@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetServices {
    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        if(object.getSpecialityies().size()>0){
            object.getSpecialityies().forEach(speciality -> {
                if(speciality.getId()==null){
                    Speciality savedSpeciality=specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save( object);
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
