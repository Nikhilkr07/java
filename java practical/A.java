// Example of Serlizable interface

import java.io.*;

class A{
    public static void main(String[] args)throws Exception {
        B b = new B();
        b.name = "nikhil";
        b.id = 30;

        File f = new File("b.txt");
              
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(b);
        fos.close();
        oos.close();

        System.out.println("Object is saved in file");

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o1 = ois.readObject();
        B b1 = (B)o1;

        System.out.println(b1.name);
        System.out.println(b1.id);

    }
}

class B implements Serializable{
    String name;
    int id;
}