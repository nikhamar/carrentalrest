package com.mypackage.controller;

import com.mypackage.models.Registration;
import com.mypackage.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;


    @RequestMapping(value = "/registration")
    public ModelAndView viewRegistration() {
        System.out.println("inside View Registration");

        return new ModelAndView("home");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(@ModelAttribute Registration registration) {
        registrationService.registerUser(registration);
        return new ModelAndView("home");


    }



    @ExceptionHandler(value=Exception.class)
    public String exception(){
        return "error";
    }
}
