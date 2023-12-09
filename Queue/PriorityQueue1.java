// implemantation of priority queue
// in order to romve element from priority queue it always remove in sorted manner.

import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();

        pq.add("Apple");
        pq.add("Mango");
        pq.add("Guava");
        pq.add("Kiwi");
        pq.add("Banana");
        pq.add("Papaya");

        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.peek());

        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

        pq1.add(50);
        pq1.add(20);
        pq1.add(30);
        pq1.add(60);
        pq1.add(90);
        pq1.add(70);

        System.out.println(pq1);
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
        System.out.println(pq1);
        System.out.println(pq1.peek());
    }    
}
