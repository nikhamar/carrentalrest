package com.example.springboot.service;

import com.example.demo.model.Deposit;
import com.example.demo.repository.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositService {

    @Autowired
    DepositRepository depositRepository;
    public List<Deposit> getAllDeposits(){

        return depositRepository.getAllDeposits();
    }
}
