//create file in java

import java.io.*;
public class F4 {
    public static void main(String[] args) throws Exception {
        File f = new File("a.txt");
        System.out.println(f.createNewFile());

        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
    }
}
