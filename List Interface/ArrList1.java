// ArrayList

import java.util.*;

public class ArrList1{
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(10.5);
        al.add(10);
        al.add("nikhil");
        al.add("sumit");
        System.out.println(al.isEmpty());
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(5));
        System.out.println(al.contains("nikhil"));
        al.add(1,20.5);
        al.set(0, 1);
        System.out.println(al);

        ArrayList al1 = new ArrayList<>(3);
        al1.add(10);
        al1.add(10.5);
        al1.add(12);
        al1.add(62);
        System.out.println(al);


      /* al1.removeAll(al);/* remove all method remove the duplicate elements duplicate elemets compare karta hai do arraylist ko or jo bhi duplicates elemetn hote hai usse remove kar deta hai jiske object se removeAll method call kiya jata hai.
        System.out.println(al1); */ 
        // al.removeAll(al1);
        al.retainAll(al1);
        System.out.println(al);

        ArrayList al2 = new ArrayList<>();
        al2.addAll(al1);/* Add all the values is collection from the another collection */
        System.out.println(al2);
    }
}