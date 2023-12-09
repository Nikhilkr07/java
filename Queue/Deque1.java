// implementation of Deque using ArrayDeque

import java.util.*;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> ad = new ArrayDeque<Integer>();

        ad.addFirst(10);
        ad.addFirst(20);
        ad.addFirst(50);
        ad.addLast(60);
        ad.addLast(40);
        ad.addLast(30);

        System.out.println(ad);

        System.out.println(ad.removeFirst());
        System.out.println(ad.removeLast());

        System.out.println(ad);
    }    
}
