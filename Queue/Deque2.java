// implementation of Stack using ArrayDeque

import java.util.*;

public class Deque2{
    public static void main(String[] args) {
        Deque<Integer> ad = new ArrayDeque<Integer>();

        ad.push(10);
        ad.push(20);
        ad.push(50);
        ad.push(60);
        ad.push(40);
        ad.push(30);

        System.out.println(ad);

        System.out.println(ad.pop());
        System.out.println(ad.pop());
        System.out.println(ad.pop());

        System.out.println(ad);


        System.out.println(ad.peek());
        
    }
}