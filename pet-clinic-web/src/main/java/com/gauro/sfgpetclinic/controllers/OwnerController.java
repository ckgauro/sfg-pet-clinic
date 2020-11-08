package com.gauro.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chandra
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","index","index.html"})
    public  String listOwners(){
        return "owners/index";
    }
}
