package com.mypackage.validator;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class GlobalHandlerException implements HandlerExceptionResolver {



    public ModelAndView resolveException(javax.servlet.http.HttpServletRequest httpServletRequest,
                                         javax.servlet.http.HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
       ModelAndView modelAndView= new ModelAndView();
       modelAndView.setViewName("error");
       modelAndView.addObject("global", "'application level error");

        return modelAndView;
    }
}
