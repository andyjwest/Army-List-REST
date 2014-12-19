package com.warhammer.build.army;

import com.warhammer.build.unit.Unit;
import com.warhammer.build.unit.UnitType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by awest on 12/18/14.
 */
@Controller
@RequestMapping(value = "{army}")
public class ArmyController {

    @RequestMapping(value = "/unit/{unit-type}", method = RequestMethod.GET)
    public List<Unit> getUnitByType(@PathVariable(value = "unit-type") UnitType unitType){
        return null;
    }


}
