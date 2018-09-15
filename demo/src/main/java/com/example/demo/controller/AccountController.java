package com.example.demo.controller;


import com.example.demo.model.Account;
import com.example.demo.service.AccountServiceJdbc;
import com.example.demo.service.Accountservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    Accountservice accountservice;
    @Autowired
    AccountServiceJdbc serviceJdbc;

    @RequestMapping(value = "/")
    public String welcome() {
        return "welcome to springboot";
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public List<Account> getAllAccounts() {

//        return accountservice.getAllAccounts();
        return serviceJdbc.getAllAccounts();
    }

    @RequestMapping(value = "/account")
    public Account getAllAccOunts(@RequestParam int accountnumber) {
        System.out.println(accountnumber);
        return accountservice.searchAccounts(accountnumber);
    }

    @RequestMapping(value = "/accounts/{accountnumber}")
    public Account getAllAccOunts1(@PathVariable int accountnumber) {
        System.out.println(accountnumber);
        return accountservice.searchAccounts(accountnumber);
    }

    @PostMapping(value = "/accountss", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Account createAccount(@RequestBody Account account) {
        return new Account(1001, 3000, "savings", "banking");
    }

    @PostMapping(value ="/acnum")
    public Account createacno(@RequestBody Account account){
        return accountservice.createAccoUnt(account);

    }


    @PostMapping(value ="/accno")
    public Account createacnoo(@RequestBody Account account){
        return serviceJdbc.createAccount(account);

    }


    @RequestMapping (value="/searchac/{accountnumber}", method = RequestMethod.GET)
    public Account searchAccounT(@PathVariable int accountnumber){

        return accountservice.searchAccounts(accountnumber);
    }
    @DeleteMapping(value = "/deletenumber/{accountnumber}")
    public void deleteAccounT(@PathVariable int accountnumber){
        accountservice.deleteAccount(accountnumber);
    }
    @PutMapping(value = "/updateaccount" )
    public Account updateAccounT(@RequestBody Account account){
        return accountservice.updateAccount(account);
    }
}