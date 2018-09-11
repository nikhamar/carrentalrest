package com.example.springbootmvc;




public class Accounts {


    private int accountnumber;

    private float amount;


    private String accountType;
    private String accountdescription;

    public Accounts() {

    }

    public Accounts(int accountnumber, float amount, String accountType, String accountdescription) {
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
