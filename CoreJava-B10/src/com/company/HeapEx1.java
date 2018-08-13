package com.company;

public class HeapEx1 {

    public static void main(String[] args) {
        String a="Hello";
        String b="Hello";
        String obj = new String("Hello World");

        StringBuilder d= new StringBuilder();
        StringBuilder e= d.append("hi").append("prasad").append("hi");
        System.out.println(e.toString());

        System.out.println(a==b);
        System.out.println(a==obj);
        System.out.println(a.equals(obj));
    }
}
