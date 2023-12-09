/*How to add User define Object in Tree set */
/*Also see the java.lang.Comparable VS java.util.Comparator */
// here i see Comparator interface.
/*in order to Sort the element in treeSet the another way to implements the Comparator interface and override its compare method which take two Object parameter and the write your logic to store element in sotring manner 
 *** in comoparable interface we can only sort the element using one info which is id,name , whatever but here we can sort using mutiple id,name,and any. by create the class sort name , sort id etc.
 */

import java.util.*;

class Emp{
    int id;
    String name;

    Emp(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id+" "+name;
    }

    public void show(){
        System.out.println(id+" "+name);
    }
}

class ComName implements Comparator{
    public int compare(Object o1, Object o2){
        Emp e1 = (Emp)o1;
        Emp e2 = (Emp)o2;

        return e1.name.compareTo(e2.name);
    }
}

class ComId implements Comparator{
    public int compare(Object o1, Object o2){
        Emp e1 = (Emp)o1;
        Emp e2 = (Emp)o2;

        if(e1.id > e2.id)
        return 1;
        else if(e1.id < e2.id)
        return -1;
        else
        return 0;
    }
}


public class TreeSet3 {
    public static void main(String[] args) {
        Comparator c1 = new ComName();
        TreeSet<Emp> ts = new TreeSet<Emp>(c1);
        Emp e1,e2,e3,e4;
        e1 = new Emp(111,"nikhil");
        e2 = new Emp(115,"sumit");
        e3 = new Emp(118,"rishabh");
        e4 = new Emp(114,"tayan");

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);

        System.out.println("Sorting with name");

        System.out.println(ts);

      Comparator c2 = new ComId();
        TreeSet<Emp> ts1 = new TreeSet<Emp>(c2);
        Emp e5,e6,e7,e8;
        e5 = new Emp(111,"nikhil");
        e6 = new Emp(115,"sumit");
        e7 = new Emp(118,"rishabh");
        e8 = new Emp(114,"tayan");

        ts1.add(e5);
        ts1.add(e6);
        ts1.add(e7);
        ts1.add(e8);

        System.out.println("Sorting with id");

        System.out.println(ts1);

    }
}

