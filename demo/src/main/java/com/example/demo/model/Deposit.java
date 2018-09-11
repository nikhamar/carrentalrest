package com.example.demo.model;

public class Deposit {

    private int accountno;
    private String account;

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getAccountno() {

        return accountno;
    }

    public String getAccount() {
        return account;
    }

    public Deposit(int accountno, String account) {

        this.accountno = accountno;
        this.account = account;
    }
}
