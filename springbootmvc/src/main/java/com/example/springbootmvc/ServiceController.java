package com.example.springbootmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ServiceController {
    @Autowired
    RestTemplate restTemplate;



    @RequestMapping(value = "/devices")
    public String services(){
        return "devices";



    }
    @RequestMapping(value = "/hello")
    public ModelAndView hello(HttpServletRequest req) {


        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("devices");
        ResponseEntity <Accounts[]> responseEntity =restTemplate.getForEntity("http://localhost:8091/accounts", Accounts[].class);
        int statusCode= responseEntity.getStatusCodeValue();
        if(statusCode >=200 && statusCode<=299){
            Accounts[] accounts= responseEntity.getBody();
            System.out.println("accounts: "+ accounts.length);
        }else{
            System.out.println("Error occured");
        }
return modelAndView;

    }
}
