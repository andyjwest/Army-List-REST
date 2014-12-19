package com.warhammer.build;

import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * Created by awest on 12/19/14.
 */
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
    T findOne(ID id);
    T save(T entity);
    T findAll();
}
