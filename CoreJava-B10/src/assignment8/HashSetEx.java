package assignment8;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class HashSetEx {

    public static void main(String[] args) {
        Set set= new HashSet();
        set.add("abd");
        set.add("edg");
        set.add("hes");

        set.add(null);
        System.out.println(Collections.min(set));
    }
}
