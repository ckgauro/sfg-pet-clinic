package com.gauro.sfgpetclinic.services.map;

import com.gauro.sfgpetclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Chandra
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long,T> map=new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }

    T save(ID id, T object){
       map.put(id, object);
       return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entery-> entery.getValue().equals(object));
    }





}
