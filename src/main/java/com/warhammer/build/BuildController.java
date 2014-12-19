package com.warhammer.build;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by awest on 12/18/14.
 */
@Controller
@RequestMapping(value = "/build")
public class BuildController {


    public ModelAndView getStartPage() {
        ModelAndView model = new ModelAndView();
        return model;
    }
}
