package org.launchcode.controllers;

import org.launchcode.models.data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PlanetController {
    @GetMapping()
    public String displayIndex(Model model) {
        model.addAttribute("planets", Planets.values());
        return "planets/index";
    }
}
