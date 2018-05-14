package com.cp.jworld.dao;

import java.util.List;

import com.cp.jworld.model.BaseEntity;

public interface EntityDao<E extends BaseEntity> {
    List<E> getAll();

    E getById(Integer id);

    void insert(E entity);

    void update(E entity);

    void deleteById(Integer id);
}
