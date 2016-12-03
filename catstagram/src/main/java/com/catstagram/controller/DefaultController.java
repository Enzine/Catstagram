package com.catstagram.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @authors Sonja Mäkipaja, Elsa Nyrhinen & Harri Kähkönen
 */

@Controller
public class DefaultController {

    @RequestMapping("*")
    public String home() {
        return "index";
    }    
}

