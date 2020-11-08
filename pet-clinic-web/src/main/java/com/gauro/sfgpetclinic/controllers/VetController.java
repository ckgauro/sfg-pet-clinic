package com.gauro.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chandra
 */
@RequestMapping("vets")
@Controller
public class VetController {

    @RequestMapping({"","index","index.html","vets.html"})
    public String ListVets(){

        return "vets/index";
    }
}
