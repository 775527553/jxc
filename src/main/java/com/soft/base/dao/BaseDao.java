package com.soft.base.dao;

import java.util.List;

public interface BaseDao<T> {

    List<T> findAll();

    T get(String id);

    List<T> findByEntity(T t);



}
