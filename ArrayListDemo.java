package collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Wrapper class object
        ArrayList list = new ArrayList();
        list.add(new Integer(10));
        list.add(new Float(30.5));
        list.add(new String("Hello"));

        //AutoBoxing
        list.add(28);
        list.add(40.5);
        list.add("Hi");

        //Adding elements using Student Class Constructor
        list.add(new Student(101, "Ajinkya", 90));
        list.add(new Student(102, "Manoj", 90));
        list.add(new Student(103, "Vaibhav", 90));

        //Add at specified index
        list.add(2, "Welcome");
        System.out.println("Size of ArrayList: " + list.size());

        //Print all elements
        System.out.println("Array List Elements: ");
        for(int i=0; i<list.size(); i++){
            Object obj = list.get(i);
            if(obj instanceof Student){
                System.out.println("Roll no: " + ((Student) obj).getRollNo());
                System.out.println("Name: " + ((Student) obj).getName());
                System.out.println("Percentage: " + ((Student) obj).getPercentage());
            }
            else System.out.println(obj);
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(20);
        list1.add(30);
        list1.add(10);
        list1.add(50);
        list1.add(40);

        System.out.println("Integer List: ");
        System.out.println(list1);
    }
}
