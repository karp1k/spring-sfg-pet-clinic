package springframework.guru.sfgpetclinic.petclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springframework.guru.sfgpetclinic.petclinicdata.services.VetService;

/**
 * @author kas
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String getIndex(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
