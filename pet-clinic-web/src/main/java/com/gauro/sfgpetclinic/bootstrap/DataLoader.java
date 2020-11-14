package com.gauro.sfgpetclinic.bootstrap;

import com.gauro.sfgpetclinic.model.*;
import com.gauro.sfgpetclinic.services.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author Chandra
 */
@Slf4j
@Component
public class DataLoader implements CommandLineRunner {
    private  final OwnerService ownerService;
    private final VetServices vetServices;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetServices vetServices, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetServices = vetServices;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }
//    public DataLoader(){
//        ownerService=new OwnerServiceMap();
//        vetServices=new VetServiceMap();
//    }

    @Override
    public void run(String... args) throws Exception {

        log.info(" Data load started=====>");
        int count=petTypeService.findAll().size();
        if(count==0){
            loadData();
        }




    }

    private void loadData() {
        PetType dog=new PetType();
        dog.setName("Dog");
        PetType savedDogPetType=petTypeService.save(dog);
        log.info(" 10=====>");
        PetType cat=new PetType();
        dog.setName("Cat");
        PetType savedCatPetType=petTypeService.save(cat);
        log.info(" 20=====>");
        Speciality radiology=new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology= specialtyService.save(radiology);
        log.info(" 30=====>");
        Speciality surgery=new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery= specialtyService.save(surgery);
        log.info(" 40=====>");
        Speciality dentistry=new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry= specialtyService.save(dentistry);
        log.info(" 50=====>");


        Owner owner1=new Owner();
        // owner1.setId(1L);
        owner1.setFirstName("Chandra");
        owner1.setLastName("Gauro");
        owner1.setAddress("123 Cheery st");
        owner1.setCity("Boston");
        owner1.setTelephone("784578121");
        Pet chandraPet=new Pet();
        chandraPet.setPetType(savedDogPetType);
        chandraPet.setOwner(owner1);
        chandraPet.setBirthDate(LocalDate.now());
        chandraPet.setName("Muunu");
        log.info(chandraPet.toString());

        log.info(" 63=====>");
        owner1.getPets().add(chandraPet);
        log.info(" 64=====>");
        log.info(owner1.toString());
        log.info(" 66=====>");
        ownerService.save(owner1);


        log.info(" 70=====>");
        Owner owner2=new Owner();
        // owner2.setId(2L);
        owner2.setFirstName("Ankush");
        owner2.setLastName("Hero");
        owner2.setAddress("2 Mahendra st");
        owner2.setCity("Birgunj");
        owner2.setTelephone("34562165");

        Pet ankushCat=new Pet();
        ankushCat.setName("Meow");
        ankushCat.setBirthDate(LocalDate.now());
        ankushCat.setPetType(savedCatPetType);
        owner2.getPets().add(ankushCat);
        ownerService.save(owner2);


        Visit catVisit=new Visit();
        catVisit.setPet(ankushCat);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Ankush Kitty");
        visitService.save(catVisit);


        log.info("Loaded Owners.....");

        Vet vet1=new Vet();
        // vet1.setId(1L);
        vet1.setFirstName("Ravi");
        vet1.setLastName("Ave");
        vet1.getSpecialityies().add(savedRadiology);
        vetServices.save(vet1);

        Vet vet2=new Vet();
        // vet2.setId(2L);
        vet2.setFirstName("Sam");
        vet2.setLastName("Porter");
        vet2.getSpecialityies().add(savedSurgery);
        vetServices.save(vet2);

        log.info("Loaded Vets....");
    }
}
