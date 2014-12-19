package com.warhammer.build.unit;

import com.warhammer.build.army.ArmyAffiliation;
import com.warhammer.build.BaseRepository;

import java.util.List;

/**
 * Created by awest on 12/19/14.
 */
public interface UnitRepository extends BaseRepository<Unit, Integer> {

    List<Unit> findByAffiliation(ArmyAffiliation armyAffiliation);
    Unit findByName(String name);
}
