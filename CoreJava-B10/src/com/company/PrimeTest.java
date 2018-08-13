package com.company;

public class PrimeTest {

    public static void main(String[] args){
        int i,n;
        boolean flag=false;
        n=29;

        for (i=2; i<n; i++){if (n % i==0)
        { flag=true;
        break;}
        }if(!flag)
            System.out.println("its a prime number");
        else System.out.println("its not a prime number");
    }
}
