//Linked list as Stack

import java.util.*;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
      
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);

        System.out.println(ll);

       ll.pop();
       ll.pop();

       System.out.println(ll);

       System.out.println(ll.peek());

    }    
}

