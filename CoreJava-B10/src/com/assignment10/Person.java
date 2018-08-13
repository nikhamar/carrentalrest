package com.assignment10;

import java.util.Arrays;
import java.util.List;

public class Person implements Comparable<Person> {
String name;
int num;

Person (String s ,int a){
    this.name=s;
    this.num=a;

}
    public static void main(String[] args) {

        List<Person> persons =

                Arrays.asList(

                        new Person("Max", 18),

                        new Person("Peter", 23),

                        new Person("Pamela", 23),

                        new Person("David", 12));


        persons.stream()
                .filter(e -> e.name.startsWith("P"))
                .forEach(w-> System.out.println(w.name));

        persons.stream().sorted().forEach(r-> System.out.println(r.name));
    }

    @Override
    public int compareTo(Person o) {
       if (this.num > o.num)
           return 1;
       else if(this.num == o.num)
           return 0;
       else return -1;

    }
}
