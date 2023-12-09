
import java.io.*;

public class Closable3 {
    public static void main(String[] args)throws Exception {
        try(FileWriter fw = new FileWriter("a.txt");FileWriter fw1 = new FileWriter("a1.txt");){
            fw.write("Nikhil");
            fw1.write("Kumar");
        }
    }
}

class B implements Closeable{
    public void close(){
        System.out.println("hello");
    }
}

