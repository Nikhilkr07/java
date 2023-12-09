//Read data from file
import java.util.*;
import java.io.*;

public class F5 {
    public static void main(String [] args) throws Exception{
        /*File f = new File("D:/bca/a.txt");
        System.out.println(f.createNewFile());*/

        FileReader fr = new FileReader("D:/bca/a.txt");
        int m = fr.read();

        while(m != -1){
            System.out.print((char)m);
            m = fr.read();
        }
    }    
}
