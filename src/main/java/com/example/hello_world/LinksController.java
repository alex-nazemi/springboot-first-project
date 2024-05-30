package com.example.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class LinksController {

    @GetMapping("/links")
    public ModelAndView index() {
        return new ModelAndView("links");
    }


}
