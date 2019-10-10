package com.chen.petclinic.services.map;

import com.chen.petclinic.models.Vet;
import com.chen.petclinic.services.CrudService;
import com.chen.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.deleteByObj(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
