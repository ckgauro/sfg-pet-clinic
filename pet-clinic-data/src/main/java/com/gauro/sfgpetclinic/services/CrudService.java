package com.gauro.sfgpetclinic.services;

import java.util.Set;

/**
 * @author Chandra
 */
public interface CrudService<T,ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
