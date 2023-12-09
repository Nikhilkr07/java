// file reader
import java.util.*;
import java.io.*;

public class F3 {
    public static void main(String[] args) throws Exception
    {
        File f = new File("a.txt");
        FileReader fr = new FileReader(f);
        System.out.println(fr.read());
    }    
}
