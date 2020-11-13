package com.gauro.sfgpetclinic.controllers;

import com.gauro.sfgpetclinic.services.VetServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chandra
 */
@RequestMapping("vets")
@Controller
public class VetController {
    private final VetServices vetServices;

    public VetController(VetServices vetServices) {
        this.vetServices = vetServices;
    }

    @RequestMapping({"","index","index.html","vets.html"})
    public String ListVets(Model model){

        model.addAttribute("vets", vetServices.findAll());
        return "vets/index";
    }
}
