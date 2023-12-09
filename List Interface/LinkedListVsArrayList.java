//in this program we can see the difference between array list and linked list which one is better.
/* * in case of the inserting the element the linked list is better perform than array list
 * but in the case of retriving(fatching) the element linked list taken much more time than array list.
 * so we can say that for inserting element linkedList is fast but in the case of fatching the element ArrayList is fast
 */

import java.util.*;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList<>();

        long st = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            al.add(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList Inserting Time "+(end-st));

        long st1 = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            ll.add(i);
        }
        long end1 = System.nanoTime();
        System.out.println("LinkedList Inserting Time "+(end1-st1));

        long st11 = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            al.get(i);
        }
        long end11 = System.nanoTime();
        System.out.println("ArrayList fatching Time "+(end11-st11));

        long st12 = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            ll.get(i);
        }
        long end12 = System.nanoTime();
        System.out.println("LinkedList fatching Time "+(end12-st12));
    }
}
