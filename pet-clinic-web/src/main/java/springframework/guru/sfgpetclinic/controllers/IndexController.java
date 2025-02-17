package springframework.guru.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kas
 */
@Controller
@RequestMapping({"/", "", "index", "index.html"})
public class IndexController {

    @GetMapping
    public String getIndex() {
        return "index";
    }
}
