//Read data from one file and write this file data into another file

import java.io.*;

public class F8 {
    public static void main(String[] args) throws Exception{
        File f1 = new File("a.txt");
        File f2 = new File("b.txt");

        FileWriter fw = new FileWriter("b.txt",true);
        FileReader fr = new FileReader("a.txt");

        int i;

        while((i = fr.read()) != -1){
            fw.write(i);
            
        }

        fw.close();

    }
    
}
