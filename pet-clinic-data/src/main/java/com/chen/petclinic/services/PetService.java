package com.chen.petclinic.services;

import com.chen.petclinic.models.Owner;
import com.chen.petclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
