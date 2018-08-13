package com.company;

import java.util.Scanner;

public class Scannerexample {
    public static void main(String[] args) {
String s1="add";
String s2="sub";
String s3="mul";
String s4="div";



        int a, b;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first number");
        a= scanner.nextInt();
        System.out.println("enter second number");
        b= scanner.nextInt();

        String s = scanner.next();
        if (s.equals(s1))
        {
            System.out.println("result is  " + (a+ b));
        } else if(s.equals(s2)){
            System.out.println("result is  " + (a- b));
        }
        else if(s.equals(s3)){
            System.out.println("result is  " + (a* b));
        }else if(s.equals(s4)){
            System.out.println("result is  " + (a / b));
        }





    }

}
