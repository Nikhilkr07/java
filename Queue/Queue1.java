// Implemantation of queue using linkedlist.

import java.util.*;

public class Queue1{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);
        System.out.println("Remove element "+q.remove());
        System.out.println("Remove element "+q.poll());
        System.out.println(q);
        System.out.println("Peek element "+q.peek());
    }
}