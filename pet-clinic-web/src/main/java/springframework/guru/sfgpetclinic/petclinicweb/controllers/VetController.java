package springframework.guru.sfgpetclinic.petclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.guru.sfgpetclinic.petclinicdata.services.VetService;

/**
 * @author kas
 */
@Controller
@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
