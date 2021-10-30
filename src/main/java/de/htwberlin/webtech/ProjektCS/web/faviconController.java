package de.htwberlin.webtech.ProjektCS.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class faviconController {

    @GetMapping(path = "/")
    public ModelAndView showHelloWorldPage() {
        return new ModelAndView("helloworld");
    }

}
