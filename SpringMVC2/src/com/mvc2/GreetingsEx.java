package com.mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GreetingsEx {

@RequestMapping(value = "/hello", method=RequestMethod.GET)
    public ModelAndView greeting() {
    ModelAndView modelAndView=new ModelAndView();
    modelAndView.setViewName("index");
        System.out.println("Hello");
        return modelAndView;
    }
}