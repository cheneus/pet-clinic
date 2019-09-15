package com.chen.petclinic.services;

import com.chen.petclinic.models.Owner;
import com.chen.petclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PetService extends CrudRepository {

    Set<Pet> findAll();
}
