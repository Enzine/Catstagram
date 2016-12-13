package com.catstagram.controller;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.catstagram.domain.Account;
import com.catstagram.repository.AccountRepository;
import com.catstagram.repository.CatRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @authors Sonja Mäkipaja, Elsa Nyrhinen & Harri Kähkönen
 */
@Controller
public class DefaultController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AccountRepository userDetailsRepository;
    
    @Autowired
    private CatRepository catRepository;

    @PostConstruct
    public void init() {
        Account user1 = new Account();
        user1.setUsername("kitty");
        user1.setPassword(passwordEncoder.encode("cat"));
        user1.setAuthorities(Arrays.asList("USER"));

        user1 = userDetailsRepository.save(user1);

        Account user2 = new Account();
        user2.setUsername("catty");
        user2.setPassword(passwordEncoder.encode("kit"));
        user2.setAuthorities(Arrays.asList("USER", "ADMIN"));

        user2 = userDetailsRepository.save(user2);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "start";
    }
    
    @RequestMapping(value = "/start", method = RequestMethod.GET) 
    public String start() {
        return "start";
    }
    
    @RequestMapping(value = "/cats", method = RequestMethod.POST)
    public String enter() {
        return "redirect:/cats";
    }

}
