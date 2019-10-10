package com.chen.petclinic.bootstrap;

import com.chen.petclinic.models.Owner;
import com.chen.petclinic.models.Vet;
import com.chen.petclinic.services.OwnerService;
import com.chen.petclinic.services.VetService;
import com.chen.petclinic.services.map.OwnerServiceMap;
import com.chen.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        vetService = new VetServiceMap();
        ownerService = new OwnerServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");

        ownerService.save(owner1);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Kat");
        vet1.setLastName("Roma");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Chen");
        vet2.setLastName("Sia");

        vetService.save(vet2);
    }
}
