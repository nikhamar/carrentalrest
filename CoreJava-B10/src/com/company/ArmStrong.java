package com.company;

public class ArmStrong {

    public static void main(String[] args)  {
        int c=0,a,val;
        int n=153;
        val=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(val==c)
            System.out.println(val+"is a armstrong number");
        else
            System.out.println(val+" is Not armstrong number");
    }
}
