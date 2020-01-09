package springframework.guru.sfgpetclinic.petclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kas
 */
@Controller
public class BasicController {

    @GetMapping("/oups")
    public String findOwners() {
        return "notimplemented";
    }
}
