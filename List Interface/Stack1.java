// Implementation of Stack
import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);

        System.out.println(s);
        System.out.println("Poped Element "+s.pop());
        System.out.println("Poped Element "+s.pop());
        System.out.println("Poped Element "+s.pop());
        System.out.println("Peek Element "+s.peek());

        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
