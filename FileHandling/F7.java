// read write into file
import java.io.*;
public class F7 {
    public static void main(String[] args)throws Exception {
        File f1 = new File("a.txt");
        File f2 = new File("b.txt");

        f1.createNewFile();
        f2.createNewFile();

        FileWriter fw = new FileWriter("a.txt",true);
        

        fw.write("ab12x");
        fw.write("\n\r");
        fw.write("34mp");

        fw.close();

        FileReader fr = new FileReader("a.txt");
        int i;
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }
    }    
}
