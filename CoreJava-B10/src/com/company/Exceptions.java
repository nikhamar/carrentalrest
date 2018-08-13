package com.company;

public class Exceptions {
    public static void main(String[] args)
    {

        try {

            int c=5/0;

        } catch (ArithmeticException e){

            System.out.println("exception occured");
        }
        catch (Exception q){

        }
        finally {
            System.out.println("finally");
        }
    }
}
