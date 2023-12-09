// introduction file 
import java.io.*;

public class F {
    public static void main(String[] args)throws Exception {
        File f = new File("A.java");
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
    }    
}
