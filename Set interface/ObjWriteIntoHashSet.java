/* Write user Define Object in Hashset */

import java.util.*;

class Emp{
    int id;
    String name;

    Emp(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int hashCode(){
        return id;
    }

    public boolean equals(Object o){
        if(o instanceof Emp){
        Emp e1 = (Emp)o;
        if(this.id == e1.id)
        return true;
        else
        return false;
        }
        return false;
    }

    public String toString(){
        return id+" "+name;
    }

    public void show(){
        System.out.println(id+" "+name);
    }
}


public class ObjWriteIntoHashSet {
    public static void main(String[] args) {
        HashSet<Emp> hs = new HashSet<Emp>();
        Emp e1,e2,e3,e4;
        e1 = new Emp(111,"nikhil");
        e2 = new Emp(111,"sumit");
        e3 = new Emp(111,"rishabh");
        e4 = new Emp(114,"Tayan");

        hs.add(e1);
        hs.add(e2);
        hs.add(e3);
        hs.add(e4);

        Iterator i = hs.iterator();

        while (i.hasNext()) {
            Emp e = (Emp) i.next();
            e.show();
            // System.out.println(i.next());
            // System.out.println(e);
        }

    }
}
