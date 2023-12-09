// Implementation of linked list.
import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        System.out.println(ll);

        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3.5);

        System.out.println(ll);

        // 2nd constructor

        LinkedList ll1 = new LinkedList(ll);
        ll1.add(10);
        ll1.add("five");
        System.out.println(ll1);

    }    
}
