package com.example.demospringrabbitmq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController {
    @RequestMapping(value = "/devices")
    public String services(){
        return "devices";
    }
}
