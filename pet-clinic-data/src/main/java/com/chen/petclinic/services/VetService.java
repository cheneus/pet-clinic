package com.chen.petclinic.services;

import com.chen.petclinic.models.Owner;
import com.chen.petclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
