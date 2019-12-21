package springframework.guru.sfgpetclinic.petclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kas
 */
@Controller
@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
public class VetController {

    @GetMapping
    public String getIndex() {
        return "vets/index";
    }
}
