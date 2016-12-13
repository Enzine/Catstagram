package com.catstagram.controller;
 
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.catstagram.domain.Registration;
import com.catstagram.repository.RegistrationRepository;
 
@Controller
@RequestMapping("/registrations")
public class RegistrationController {
 
    @Autowired
    private RegistrationRepository registrationRepository;
     
    @ModelAttribute
    private Registration getRegistration() {
        return new Registration();
    }
 
    @RequestMapping(method = RequestMethod.GET)
    public String view() {
        return "form";
    }
 
    @RequestMapping(method = RequestMethod.POST)
    public String register(
            @Valid @ModelAttribute Registration registration,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
 
        registrationRepository.save(registration);
        return "start";
    }
}
