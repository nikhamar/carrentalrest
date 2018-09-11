package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "accounts")
public class Account {

@Id
@GeneratedValue
@Column (name = "accountnumber")
    private int accountnumber;
@Column(name="amount")
    private float amount;

@Column(name = "accounttype")
    private String accountType;
@Column(name = "accountdescription")
    private String accountdescription;

    public Account() {

    }

    public Account(int accountnumber, float amount, String accountType, String accountdescription) {
        this.accountnumber = accountnumber;
        this.amount = amount;
        this.accountType = accountType;
        this.accountdescription = accountdescription;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountdescription(String accountdescription) {
        this.accountdescription = accountdescription;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public float getAmount() {
        return amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountdescription() {
        return accountdescription;
    }
}
