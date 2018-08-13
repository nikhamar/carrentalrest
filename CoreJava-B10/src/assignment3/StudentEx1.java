package assignment3;
import java.util.Scanner;
public class StudentEx1 {
    public static void main(String[] args) {
        System.out.println("Enter Number Of Students : ");
        Scanner scr = new Scanner(System.in);
        int numberOfStudents = scr.nextInt();

        String[] nameArray = new String[numberOfStudents];
        String[] sectionArray = new String[numberOfStudents];
        int[] idArray = new int[numberOfStudents];
        double[] feeArray = new double[numberOfStudents];


        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.println("Enter Student " + i + " name : ");
            nameArray[i-1] = scr.next();

            System.out.println("Enter Student " + i + " id : ");
            idArray[i-1] = scr.nextInt();

            System.out.println("Enter Student " + i + " fee : ");
            feeArray[i-1] = scr.nextDouble();

            System.out.println("Enter Student " + i + " section : ");
            sectionArray[i-1] = scr.next();





        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(nameArray[i] + " , " + sectionArray[i] + " , " + idArray[i] + " , " + feeArray[i]);



        }
    }
}

