package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new Integer(10));
        set.add(new Float(20.5));
        set.add(new String("Hello"));
        set.add(50.5);
        set.add(10);
        set.add(new Student(101, "Ajinkya", 91));
        set.add(new Student(102, "Manoj", 80));
        set.add(new String("Hello"));
        set.add(50.5);
        set.add(new Student(102, "Manoj", 80));
        set.add(10);
        System.out.println("Size of hashset: " + set.size());

        Iterator it = set.iterator();
        while (it.hasNext()) System.out.println(it.next());

        HashSet<String> set1 = new HashSet<String>();
        set1.add("Hello");
        set1.add("Hi");
        set1.add("Bye!!!");
        set1.add("Hi");
        set1.add("Bye!!!");

        System.out.println("String Set: ");
        System.out.println(set1);
    }
}
