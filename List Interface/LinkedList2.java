// in this program we see the use of (generic)

import java.util.*;

public class LinkedList2 {
    public static void main(String[] args) {
         LinkedList<String> ll = new LinkedList<String>();
        /*This linkedlist is a generic type  we can add value of only that type which type of LinkedList is create here this is the String so we can add only String type value in this LinkedList.*/

        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");

        System.out.println(ll);

        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        System.out.println(ll1);
        
        /*Traversal using iterator*/
        System.out.println("Traversal using iterator");

        Iterator<String> i = ll.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("Traversal using ListIterator");
        ListIterator<Integer> li = ll1.listIterator();

        System.out.println("Forward direction");
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("backward direction");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
