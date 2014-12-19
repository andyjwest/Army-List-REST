package com.warhammer.build.army;

import com.warhammer.build.BaseRepository;

import java.util.List;

/**
 * Created by awest on 12/19/14.
 */
public interface ArmyRepository extends BaseRepository<Army, Integer>{

    public List<Army> findByArmyAffiliation(ArmyAffiliation armyAffiliation);
    public List<Army> findByAllowedPoints(int allowedPoints);
    public Army findByName(String name);

}
