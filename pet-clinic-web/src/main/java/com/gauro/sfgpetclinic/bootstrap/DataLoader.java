package com.gauro.sfgpetclinic.bootstrap;

import com.gauro.sfgpetclinic.model.Owner;
import com.gauro.sfgpetclinic.model.Vet;
import com.gauro.sfgpetclinic.services.OwnerService;
import com.gauro.sfgpetclinic.services.VetServices;
import com.gauro.sfgpetclinic.services.map.OwnerServiceMap;
import com.gauro.sfgpetclinic.services.map.VetServiceMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Chandra
 */
@Slf4j
@Component
public class DataLoader implements CommandLineRunner {
    private  final OwnerService ownerService;
    private final VetServices vetServices;

    public DataLoader(OwnerService ownerService, VetServices vetServices) {
        this.ownerService = ownerService;
        this.vetServices = vetServices;
    }
//    public DataLoader(){
//        ownerService=new OwnerServiceMap();
//        vetServices=new VetServiceMap();
//    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
       // owner1.setId(1L);
        owner1.setFirstName("Chandra");
        owner1.setLastName("Gauro");
        ownerService.save(owner1);

        Owner owner2=new Owner();
       // owner2.setId(2L);
        owner2.setFirstName("Ankush");
        owner2.setLastName("Hero");
        ownerService.save(owner2);

        log.info("Loaded Owners.....");

        Vet vet1=new Vet();
       // vet1.setId(1L);
        vet1.setFirstName("Ravi");
        vet1.setLastName("Ave");
        vetServices.save(vet1);

        Vet vet2=new Vet();
       // vet2.setId(2L);
        vet2.setFirstName("Sam");
        vet2.setLastName("Porter");
        vetServices.save(vet2);

        log.info("Loaded Vets....");







    }
}
