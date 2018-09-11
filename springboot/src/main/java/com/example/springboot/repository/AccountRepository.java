package com.example.springboot.repository;

import com.example.demo.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository <Account, Integer> {


}
//    List<Account> accounts = new ArrayList<>();
//
//    public List<Account> getAllAccounts() {
//
//        accounts.add(new Account(1234, 1000, "saving", "Business account"));
//        accounts.add(new Account(7895, 1752, "checking", "private account"));
//        return accounts;
//
//    }
//
//
//    public Account searchAccount(int accountnumber) {
//
//        Account account = new Account();
//
//        accounts.add(new Account(1234, 1000, "saving", "Business account"));
//        accounts.add(new Account(7895, 1752, "checking", "private account"));
//        for (int i = 0; i < accounts.size(); i++) {
//            if (accounts.get(i).getAccountnumber() == accountnumber) {
//                account = accounts.get(i);
//
//            }
//        }
//        return account;
//    }
//
//    public Account createAccount(){
//        return new Account(124,4856,"checking","primary account");
//    }


