package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class Accountservice {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();

        accountRepository.findAll().forEach(new Consumer<Account>() {
            @Override
            public void accept(Account account) {
                accounts.add(account);
            }
        });
        return accounts;
    }

    public Account searchAccounts(int accountnumber) {
        return accountRepository.findById(accountnumber).get();
    }

    public Account createAccoUnt(Account account) {

        return accountRepository.save(account);
    }

    public Account updateAccount(Account account){

      return accountRepository.findById(account.getAccountnumber())
                .map(account1 ->{ account1.setAccountnumber(account.getAccountnumber());
                account1.setAmount(account.getAmount());
                account1.setAccountType(account.getAccountType());
                account1.setAccountdescription(account.getAccountdescription());
                return accountRepository.save(account1);

        }).orElseGet(()->{
                return accountRepository.save(account);}
        );




    }
    public void deleteAccount(int accountnumber){
        accountRepository.deleteById(accountnumber);

    }
}
