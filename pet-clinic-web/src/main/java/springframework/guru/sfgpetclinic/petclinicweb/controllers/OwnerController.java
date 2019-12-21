package springframework.guru.sfgpetclinic.petclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kas
 */
@Controller
@RequestMapping(value = "/owners")
public class OwnerController {

    @GetMapping(value = {"", "/", "/index", "/index.html"})
    public String getIndex() {
        return "owners/index";
    }
}
