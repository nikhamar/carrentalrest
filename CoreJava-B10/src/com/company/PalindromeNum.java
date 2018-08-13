package com.company;

public class PalindromeNum {

    public static void main(String[] args) {

        int n = 57975;
        int rev = 0;
        for (int i = n; i != 0; i /= 10) {
            rev = rev * 10 + i % 10;

        }
        if (rev == n)
            System.out.println("the given number is Palindrome " + rev);
        else
            System.out.println("the given number is not Palindrome ");
    }
}
