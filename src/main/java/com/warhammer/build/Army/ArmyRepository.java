package com.warhammer.build.Army;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by awest on 12/19/14.
 */
public interface ArmyRepository<Army, Integer> extends Repository<Army, Integer> {

    Army findOne(Integer id);
    List<Army> findAll();
    Army save(Army army);
}
