package com.company;

public class Hello {

    int a=10;
    String b= "Hello";

    public Hello(){

    }
    public static void main (String [] args){
        System.out.println("Hello World");
        Hello obj1 = new Hello();

        System.out.println(add (5, 10));
        System.out.println(obj1.substract (5,10));
        System.out.println(multiple (5, 10));
        System.out.println(divide(5, 10));

    }
public static int add(int a, int b){
        return a+b;
}
public int substract(int a, int b){
        return a-b;
}
    public static int multiple(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b){
        return a/b;}
}
