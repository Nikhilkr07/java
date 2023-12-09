// How to write user define Object in HashMap

import java.util.*;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<EmpId,Emp> hm = new HashMap<EmpId,Emp>();
        Emp e1,e2,e3;
        EmpId id1,id2,id3;

        e1 = new Emp("Nikhil"); 
        e2 = new Emp("Nikhil");
        e3 = new Emp("Nikhil");

        id1 = new EmpId(001);
        id2 = new EmpId(001);
        id3 = new EmpId(001);

        hm.put(id1, e1);
        hm.put(id2, e2);
        hm.put(id3, e3);

        Set s = hm.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext()) {
            Map.Entry m = (Map.Entry)i.next();
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }    
}

class Emp{
    String name;

    Emp(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

class EmpId{
    int id;

    EmpId(int id){
        this.id = id;
    }

    public int hashCode(){
        return id;
    }

    public boolean equals(Object o){
        if(o instanceof EmpId){
            EmpId i = (EmpId)o;
            if(i.id == this.id){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public String toString(){
        return " "+id;
    }
}
