/*How to add User define Object in Tree set */
/*Also see the java.lang.Comparable VS java.util.Comparator */
// here i see Comparable interface.
/*Inorder to write an object in TreeSet 
 * first we have to implements the Comparable interface.
 * And than we have to Override the compareTo method of Comparable interface.
 * And after this we downcast the Object class refeence to Emp type.
 * and at the last we write our tree logic if element is greater than roo so element is goining to be right and if it is less than root so it goining to be left and if element is same than its return zero. because duplicate element is not allow in treeSet. 
 */

import java.util.*;

class Emp implements Comparable{
    int id;
    String name;

    Emp(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int compareTo(Object o){
            Emp e = (Emp)o;
            if(this.id>e.id) // Here i inserting the element behalf of id
            return 1;
            else if(this.id<e.id)
            return -1;
            else
            return 0;
    }

    public String toString(){
        return id+" "+name;
    }

    public void show(){
        System.out.println(id+" "+name);
    }
}


public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Emp> ts = new TreeSet<Emp>();
        Emp e1,e2,e3,e4;
        e1 = new Emp(111,"nikhil");
        e2 = new Emp(115,"sumit");
        e3 = new Emp(118,"rishabh");
        e4 = new Emp(114,"Tayan");

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);

        Iterator i = ts.iterator();

        while (i.hasNext()) {
            Emp e = (Emp) i.next();
            e.show();
            // System.out.println(i.next());
            // System.out.println(e);
        }

    }
}
