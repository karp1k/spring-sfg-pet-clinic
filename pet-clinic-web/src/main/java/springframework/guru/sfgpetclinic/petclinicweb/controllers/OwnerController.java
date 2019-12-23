package springframework.guru.sfgpetclinic.petclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.guru.sfgpetclinic.petclinicdata.services.OwnerService;

/**
 * @author kas
 */
@Controller
@RequestMapping(value = "/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping(value = {"", "/", "/index", "/index.html"})
    public String getIndex(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
