package com.company;

public class Employee {

    public Employee()
    {

    }
    int empid;
    String ename;
    static int salary;

    public Employee(int empid, String ename,
                    int salary)
    {

    this.empid=empid;
    this.ename=ename;
    this.salary=salary;

    }


    public static void main(String[] args){
        Employee emp1= new Employee(1001,"xyz",100);


        Employee emp2 = new Employee(1002,"zxy",2000);

        Employee emp3= new Employee(1003,"xzy",3000);

        System.out.println(emp1.empid);
        System.out.println(emp2.empid);
        System.out.println(emp1.getsalary());


    }
    public int getsalary ()
    {
        return salary;

    }
}
