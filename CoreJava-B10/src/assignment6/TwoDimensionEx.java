package assignment6;

import java.util.Scanner;

public class TwoDimensionEx {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");

        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();

        int[] array = new int[10];
        for (int i = 1; i <= array.length; i++) {
            array[i-1] = number*i;
            System.out.println(number + " * " + i + " = " + (array[i-1]) );
        }
    }

}
