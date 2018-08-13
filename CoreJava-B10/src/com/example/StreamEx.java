package com.example;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

    public static void main(String[] args) {


        List<String> list= Arrays.asList("Nikhil","Amaraneni","Prasad","Harish");
        list.stream().filter(s -> {
            System.out.println("inside filter");
            return s.startsWith("A");
        }).forEach(s -> System.out.println(s));

    }


}
