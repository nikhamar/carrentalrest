package assignment8;

import assignment2.InterfaceEx1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(145);
        list.add(178);
        list.add(587);
        Iterator iterator= list.iterator();

        System.out.println(Collections.min(list));


       }
    }

