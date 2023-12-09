// Question : Write a progtam to read a file and to write into another file of type numeric digits.
import java.io.*;

public class FileQ {
    public static void main(String[] args)throws Exception {
        File f1 = new File("a.txt");
        File f2 = new File("b.txt");

        FileWriter fw = new FileWriter("b.txt",true);
        FileReader fr = new FileReader("a.txt");

        int i;

        while((i = fr.read()) != -1){
            char c = (char)i;

            if(Character.isDigit(c)){
                fw.write(i);
            }
        }
        fw.close();
    }    
}
