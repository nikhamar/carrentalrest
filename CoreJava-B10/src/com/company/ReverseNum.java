package com.company;

public class ReverseNum {
    public static void main(String[] args) {

    int n=579432;
    int rev=0;
    for(int i =n;i!=0;i/=10){
        rev= rev*10 + i%10;

    }
        System.out.println("the reverse of the given number is "+ rev);
    }
}
