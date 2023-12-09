import java.io.*;

public class ByteStream1 {
    public static void main(String[] args)throws Exception {
        FileWriter fw = new FileWriter("a.txt");

        FileOutputStream fw1 = new FileOutputStream("b.txt");
        //fw1.write("san");
        //fw1.write("san".getBytes());
        //fw1.close();
        byte n[] = {97,98,99,100};
        String p = new String(n);
        System.out.println(p);
        fw1.write(n);
        fw1.close();
    }
}
