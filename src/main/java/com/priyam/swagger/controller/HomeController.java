package com.priyam.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dni_tahniat on 3/14/2018.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        return "redirect:swagger-ui.html";
    }
}
