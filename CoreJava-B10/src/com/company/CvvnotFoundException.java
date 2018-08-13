package com.company;

public class CvvnotFoundException  extends Exception {

        String str;
        CvvnotFoundException(String str)
        {
            this.str=str;
            System.out.println("not a valid number...");
        }



}
