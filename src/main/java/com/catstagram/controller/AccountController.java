package com.catstagram.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sonjamak
 */
@Controller
public class AccountController {

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logout() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        auth.setAuthenticated(false);
        return "redirect:/cats";
    }
}
