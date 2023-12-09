// Question read from file and write into another file
import java.io.*;

public class ReadWrite {
    public static void main(String[] args) throws Exception{
        File f = new File("c.txt");
        
        FileWriter fw = new FileWriter(f);

        FileReader fr = new FileReader("a.txt");
        int i;
        while((i = fr.read()) != -1){
            char c = (char)i;
            fw.write(c);
        }
        fw.close();
    }    
}
