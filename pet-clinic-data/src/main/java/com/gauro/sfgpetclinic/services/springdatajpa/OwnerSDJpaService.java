package com.gauro.sfgpetclinic.services.springdatajpa;

import com.gauro.sfgpetclinic.model.Owner;
import com.gauro.sfgpetclinic.repositories.OwnerRepository;
import com.gauro.sfgpetclinic.repositories.PetRepository;
import com.gauro.sfgpetclinic.repositories.PetTypeRepository;
import com.gauro.sfgpetclinic.services.OwnerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Chandra
 */
@Slf4j
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService  implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;
    @Value("${spring.profiles.active}")
    String a;


    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @PostConstruct
    public void display(){
        log.info("Profile checking PostConstruct =========>**********");
        log.info(a);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners=new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        log.info("OwnerSDJpaService is called ################");
        log.info("###############");

        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
