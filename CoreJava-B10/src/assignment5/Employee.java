package assignment5;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private Department dept;
    private double salary;

    public Employee(int id, String name, Department dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if((this.id == o.id) && (this.dept == o.dept) && (this.name == o.name))
            return 0;
        else
            return 1;
    }
}