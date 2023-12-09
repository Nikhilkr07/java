// Write data into file

import java.util.*;
import java.io.*;

public class F6 {
    public static void main(String[] args)throws Exception {
        File f = new File("D:/bca/b.txt");
        FileWriter fw = new FileWriter(f); // File append

        BufferedWriter bfr = new BufferedWriter(fw);

        bfr.write("1");
        bfr.write("2");
        bfr.write("3");
        bfr.write("Nikhil");

        bfr.close();
    }    
}
