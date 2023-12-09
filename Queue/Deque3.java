// implementation of Deque using Linkedlist

import java.util.*;

public class Deque3 {
    public static void main(String[] args) {
        Deque<String> ll = new LinkedList<String>();

        ll.addFirst("apple");
        ll.addFirst("mango");
        ll.addFirst("banana");
        ll.addLast("kiwi");
        ll.addLast("guava");
        ll.addLast("grapes");

        System.out.println(ll);

        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());

        System.out.println(ll);
    }    
}

