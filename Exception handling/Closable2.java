
import java.io.*;

public class Closable2 {
    public static void main(String[] args)throws Exception {
        try(FileWriter fw = new FileWriter("a.txt");){
            fw.write("Nikhil");
        }
    }
}

class B implements Closeable{
    public void close(){
        System.out.println("hello");
    }
}
