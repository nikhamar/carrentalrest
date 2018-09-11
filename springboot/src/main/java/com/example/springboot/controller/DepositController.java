package com.example.springboot.controller;

import com.example.demo.model.Deposit;
import com.example.demo.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepositController {
    @Autowired
    DepositService depositService;
    @RequestMapping(value = "/deposits")
    public List<Deposit> getAllDeposits(){

        return depositService.getAllDeposits();
    }
}
