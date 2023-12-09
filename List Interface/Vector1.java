// Vector
import java.util.*;

public class Vector1 {    
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
        v.addElement('A');/*we can add element in vector using two mehtods 1st is add and another is addElement method */
        v.addElement('B');
        v.add("nikhil");
        v.add("Tayan");

        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());/* after inserting element in vector is beyon of its capacity it's increase our capacity automatically by double (2 times) */

        Vector v1 = new Vector(3); // 2nd Constructor
        System.out.println(v1.capacity());

        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);

        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());

        Vector v2 = new Vector(3,2); // 3rd Constructor (intial capacity, incremental factor)
        System.out.println(v2.capacity());

        v2.add('a');
        v2.add('b');
        v2.add('c');
        v2.add('d');

        System.out.println(v2);
        System.out.println(v2.size());
        System.out.println(v2.capacity());

        Vector v3 = new Vector(v);
        System.out.println(v3.capacity());
        System.out.println(v3);
        System.out.println(v3.size());
        
    }
}
