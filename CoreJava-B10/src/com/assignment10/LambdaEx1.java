package com.assignment10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaEx1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("d2", "a2", "b1", "b3", "c");
        list.stream().filter(s->  s.startsWith("a") )
                .forEach(s-> System.out.println(s.toUpperCase()) );


        List<Integer> numbers = Arrays.asList(1, 5, 7, 3, 8, 10, 48, 67, 2, 23, 56, 11, 4, 100);

        numbers.stream().filter(s-> s > 5).forEach(s1-> System.out.println(s1));







    }


}
