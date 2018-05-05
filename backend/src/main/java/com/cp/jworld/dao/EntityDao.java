package com.cp.jworld.dao;

import java.util.List;

import com.cp.jworld.model.Entity;

public interface EntityDao<E extends Entity> {
    List<E> getAll();

    E getById(Integer id);

    void insert(E entity);

    void update(E entity);

    void deleteById(Integer id);
}
