package com.mypackage;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloEx {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        EmployeeEx employeeEx=new EmployeeEx();
        EmployeeEx employeeEx1=new EmployeeEx();

        employeeEx.setName("nikhil");
        employeeEx.setId("101");
        employeeEx1.setId("102");
        employeeEx1.setName("nikh");
        List arrayList= new ArrayList();
        arrayList.add(employeeEx);
        arrayList.add(employeeEx1);




        modelAndView.addObject("list",arrayList);
        return modelAndView;
    }


}
