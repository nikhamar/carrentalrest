package com.mypackage.controller;


import com.mypackage.models.Doctor;
import com.mypackage.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoctorsController {
    @Autowired
    DoctorService doctorService;

    @RequestMapping(value = "/doctors")
    public ModelAndView doctors() {
        return new ModelAndView("doctors");
    }
}
