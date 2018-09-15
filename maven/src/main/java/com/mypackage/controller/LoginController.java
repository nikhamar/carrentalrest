package com.mypackage.controller;


import com.mypackage.models.Login;
import com.mypackage.services.LoginService;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@SessionAttributes("login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {

        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject(new Login());
        return modelAndView;

    }

    @RequestMapping(value = "/validatelogin", method = RequestMethod.POST)
    public Object validateLogin(@ModelAttribute("login") Login login) {


        Map hashMap = loginService.checkLogin(login);

        return loginService.validateLogin(login, hashMap);

    }


}