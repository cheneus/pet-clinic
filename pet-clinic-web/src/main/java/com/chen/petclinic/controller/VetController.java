package com.chen.petclinic.controller;

import com.chen.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/", "", "/all"})
    public String listVets(Model model) {

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
