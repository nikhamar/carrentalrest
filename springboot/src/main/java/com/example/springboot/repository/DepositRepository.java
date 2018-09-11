package com.example.springboot.repository;

import com.example.demo.model.Deposit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepositRepository {

    public List<Deposit> getAllDeposits(){

        List<Deposit> deposits=new ArrayList<>();
        deposits.add(new Deposit(3221654,"saving"));
        deposits.add(new Deposit(21654,"checking"));
        return deposits;
    }
}
