package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();

        set.add(new Integer(10));
        set.add(new Float(20.5));
        set.add(new String("Hello"));
        set.add(50.5);
        set.add(101);
        set.add(new Student(101, "Ajinkya", 91));
        set.add(new Student(102, "Manoj", 80));
        set.add(new String("Hello"));
        set.add(50.5);
        set.add(new Student(102, "Manoj", 80));
        set.add(101);
        System.out.println("Size of hashset: " + set.size());

        Iterator it = set.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
