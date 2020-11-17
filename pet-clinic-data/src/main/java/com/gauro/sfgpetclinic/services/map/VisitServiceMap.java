package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.Visit;
import com.gauro.sfgpetclinic.services.VisitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Chandra
 */
@Slf4j
@Service
@Profile({"default","map"})
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null ||
                visit.getPet().getOwner().getId() == null) {
            log.info("Invalid Visit following line is disabled ===========>");
           // throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
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
