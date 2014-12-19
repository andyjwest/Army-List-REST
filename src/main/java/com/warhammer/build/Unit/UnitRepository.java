package com.warhammer.build.Unit;

import com.warhammer.build.Army.ArmyAffiliation;
import com.warhammer.build.BaseRepository;

import java.util.List;

/**
 * Created by awest on 12/19/14.
 */
public interface UnitRepository extends BaseRepository<Unit, Integer> {

    List<Unit> findByAffiliation(ArmyAffiliation armyAffiliation);
    Unit findByName(String name);
}
