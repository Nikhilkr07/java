// Traversal using Iterator method

import java.util.*;

public class ArrList2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(10.5);
        al.add(10);
        al.add("nikhil");
        al.add("sumit");
        System.out.println(al);

        System.out.println("Traversal using iterator");
        Iterator i = al.iterator();
        System.out.println(i);
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("Traversal by using ListIterator");
        ListIterator li = al.listIterator();
        System.out.println(li);
        System.out.println("Forward");
        while(li.hasNext()){
            System.out.println(li.next());
        }

        /*Backword traversal se pehle forward traversal karna jaruri hai */
        System.out.println("Backword");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
