package com.nikischultz.finalconcertapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = {"/", "", "/index"})
    public String index() {
        System.out.println("Hello There!");
        return "/index";

    }

}
