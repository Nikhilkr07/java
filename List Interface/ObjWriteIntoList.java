/* In this program we can see that "How to Add User Define Object in LinkedList and ArrayList." */
/* here we can create package and this is emp class and onther class to perform the inserting element in ArrayList is Test.java */
import java.util.*;

class Emp {
    String name, comname;
    int age,id;
    
    Emp(String name, String comname, int age, int id){
        this.name = name;
        this.comname = comname;
        this.age = age;
        this.id = id;
    }

    public void show(){
        System.out.print("[ "+name);
        System.out.print(" "+comname+" ");
        System.out.print(" "+age+" ");
        System.out.println(" "+id+" ]");
    }

    public String toString(){
        return "[ "+name+" "+comname+" "+age+" "+id+" ]";
    }
}


public class ObjWriteIntoList {
    public static void main(String[] args) {
        ArrayList<Emp> al = new ArrayList<Emp>();
        Emp e1,e2,e3,e4,e5;
        e1 = new Emp("Nikhil","Google",19,30);
        e2 = new Emp("Sumit","Amazon",20,40);
        e3 = new Emp("Sachin","Microsoft",19,50);
        e4 = new Emp("Monty","Adobe",19,60);
        e5 = new Emp("Rishabh","Facebook",19,70);

        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);

        // System.out.println(al);

        Iterator<Emp> i = al.iterator();
        while(i.hasNext()){
            Emp e = (Emp) i.next();
            // e.show();
            System.out.println(e);// because we override the otString method

        }
    }    
}

