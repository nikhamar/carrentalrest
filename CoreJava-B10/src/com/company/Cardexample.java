package com.company;

import java.util.Scanner;

public class Cardexample {
    static int c2=123;
    static String c3="nikhil";
    public static void main(String[] args){

        long c1=123456789;
        Scanner scr = new Scanner(System.in);
        System.out.println("enter 16 digit card number");
        int a=scr.nextInt();

        if (c1==a) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter 3 digit cvv number of the card");
            int c = s.nextInt();

            if (c2 == c) {
                System.out.println("enter the name on the card");
                String d = s.next();

                if (c3.equals(d)) {
                    System.out.println("card is valid");


                }else{
                    throw new ArithmeticException("name not valid");
                }

            }
            else
            {

                throw new ArithmeticException("cvv is not valid");
            }


        }else {
            throw new ArithmeticException("card is not valid");

        }

    }
}
