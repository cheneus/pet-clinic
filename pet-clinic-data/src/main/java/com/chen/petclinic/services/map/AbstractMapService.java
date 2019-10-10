package com.chen.petclinic.services.map;

import com.chen.petclinic.models.BaseEntity;

import java.util.*;

// passing BaseEntity makes it similar to an ID class
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long>  {

    protected Map<Long, T> map= new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if (object != null) {
            if(object.getId() == null) {
                object.setId(getNextid());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void deleteByObj(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private Long getNextid() {

        Long nextId = null;

        try {
            return Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
