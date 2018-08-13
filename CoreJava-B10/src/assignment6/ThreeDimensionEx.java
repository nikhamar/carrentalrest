package assignment6;

import java.util.Scanner;

public class ThreeDimensionEx {


    public static void main(String[] args) {
        System.out.println("Enter the number : ");

        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();

        int[][] array = new int[10][10];
        for (int i = 1; i <= array.length; i++) {
            for(int j = 1; j<=array.length; j++) {

                array[i-1][j-1] = number*i*j;
                System.out.println(number + " * " + i +" * "+ j +" = " + (array[i-1][j-1]) );

            }
        }
    }
}
