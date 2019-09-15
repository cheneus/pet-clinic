package com.chen.petclinic.services.map;

import com.chen.petclinic.models.Owner;
import com.chen.petclinic.services.CrudService;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.deleteByObj(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
