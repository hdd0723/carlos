package org.hdd.carlos.springboot05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String helloWorld(Model model) {
        model.addAttribute("mav", "Hello, Thymeleaf");
        return "hello";
    }
}
