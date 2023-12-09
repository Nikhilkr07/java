// use linked list as Dequeue
import java.util.*;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
      
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("six");

        System.out.println(ll);

        ll.add(4,"five");
        System.out.println(ll);

        System.out.println("LinkedList As Dequeue");

        ll.addFirst("first");
        ll.addLast("last");
        System.out.println(ll);
        System.out.println(ll.isEmpty());
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(3));

    }    
}
