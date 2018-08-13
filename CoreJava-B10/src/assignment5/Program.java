package assignment5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {


    public static void main(String[] args) {
        System.out.println("Enter number of Employees : ");

        Scanner scr = new Scanner(System.in);
        int numberOfEmployees = scr.nextInt();

        Set<Employee> employeeSet = new TreeSet<>();

        for (int i = 1; i <= numberOfEmployees; i++) {

            System.out.println("Enter Employee " + i + " name : ");
            String name = scr.next();

            System.out.println("Enter Employee " + i + " id : ");
            int id = scr.nextInt();

            System.out.println("Enter Employee " + i + " salary : ");
            double salary = scr.nextDouble();

            System.out.println("Enter Employee " + i + " Department Name : ");
            String depName = scr.next();

            System.out.println("Enter Employee " + i + " Department id : ");
            int depId = scr.nextInt();

            System.out.println("Enter Employee " + i + " Location : ");
            String location = scr.next();

            Department dep = new Department(depId, depName, location);
            employeeSet.add(new Employee(id, name, dep, salary));
        }

        Iterator<Employee> iterator = employeeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }




    }
}
