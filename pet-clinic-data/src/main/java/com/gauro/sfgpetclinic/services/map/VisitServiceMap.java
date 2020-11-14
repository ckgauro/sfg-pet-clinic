package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Visit;
import com.gauro.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Chandra
 */
@Service
public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }
    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
         super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }



}
