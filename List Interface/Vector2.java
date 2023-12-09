// Vector traversal
import java.util.*;

public class Vector2 {    
    public static void main(String[] args) {
        Vector v = new Vector();
        /*By default capacity of vector in 10 */
        System.out.println(v.capacity());

        v.add(10);
        v.add(20);
        v.add(10.5);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(20.5);
        v.addElement('A');
        v.addElement('B');
        v.add("nikhil");
        v.add("Tayan");

        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());

        Iterator i = v.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        // and also using for and for each loop similar as Array list
    }
}

