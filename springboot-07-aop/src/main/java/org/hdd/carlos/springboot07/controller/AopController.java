package org.hdd.carlos.springboot07.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    @RequestMapping("/aoptest")
    public String aopTest() {
        System.out.println("aop test on console");
        return "aop test result";
    }
}
