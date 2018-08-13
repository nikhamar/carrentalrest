package assignment3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentEx2 implements Comparator<StudentEx2>, Comparable<StudentEx2> {
    int id, fee;
    String name,section;

    public StudentEx2(int id, int fee, String name, String section) {
        this.id = id;
        this.fee = fee;
        this.name = name;
        this.section = section;
    }

    @Override
    public String toString() {
        return "StudentEx2{" +
                "id=" + id +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Set studentEx2TreeSet = new TreeSet();

        studentEx2TreeSet.add(new StudentEx2(143, 1500, "Nikhil", "A"));
        studentEx2TreeSet.add(new StudentEx2(213, 1010, "asdf", "B"));
        studentEx2TreeSet.add(new StudentEx2(123, 1000, "Nikhil", "C"));
        studentEx2TreeSet.add(new StudentEx2(123, 1000, "Nikhil", "C")); //Duplicate//
        studentEx2TreeSet.add(new StudentEx2(123, 1000, "Nikhil", "C")); //Duplicate//


        Iterator<StudentEx2> iterator = studentEx2TreeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Override
    public int compareTo(StudentEx2 o) {
        return (this.name).compareTo(o.name);
    }

    @Override
    public int compare(StudentEx2 o1, StudentEx2 o2) {
        return o1.id - o2.id;
    }
}
