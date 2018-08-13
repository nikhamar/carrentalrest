package collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx implements Comparable {
    int id;
    String name;

    public TreeSetEx(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        TreeSetEx s1 = new TreeSetEx(10, "nikhil");
        TreeSetEx s2 = new TreeSetEx(21, "prssad");
        TreeSetEx s3 = new TreeSetEx(5, "harish");

        Set<TreeSetEx> students = new TreeSet<TreeSetEx>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);
    }

    @Override
    public String toString() {
        return this.id+""+this.name;

    }

    @Override
    public int compareTo(Object o) {
       TreeSetEx s=(TreeSetEx)o;
        if (this.id > s.id) {
            return 1;
        } else {
            return -1;
        }
    }



}


