package com.catstagram.controller;

import com.catstagram.domain.Cat;
import com.catstagram.repository.AccountRepository;
import com.catstagram.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @authors Sonja Mäkipaja, Elsa Nyrhinen & Harri Kähkönen
 */
@Controller
public class CatController {

    @Autowired
    private AccountRepository userDetailsRepository;

    @Autowired
    private CatRepository catRepository;

    @RequestMapping(value = "/cats", method = RequestMethod.GET)
    public String cats(Model model) {
        if (catRepository.findAll().isEmpty()) {
            Cat a = new Cat("Kissi", 1);
            Cat b = new Cat("Mirri", 3);
            Cat c = new Cat("Laku", 8);
            catRepository.save(a);
            catRepository.save(b);
            catRepository.save(c);
        }
        model.addAttribute("cats", catRepository.findAll());
        return "index";
    }

}
