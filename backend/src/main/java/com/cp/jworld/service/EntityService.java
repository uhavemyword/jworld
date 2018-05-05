package com.cp.jworld.service;

import com.cp.jworld.model.Entity;

import java.util.List;

public interface EntityService<E extends Entity> {
    List<E> getAll();

    E getById(Integer id);

    void insert(E entity);

    void update(E entity);

    void deleteById(Integer id);
}