// Byte stream class input output
import java.io.*;
class FileIo{
    public static void main(String[] args) throws Exception{
        // FileOutputStream fout = new FileOutputStream("ab.txt");
        // iske constructor ki by default value false hoti hai issiliye har baar new data dalne per pehle wala data nahi rehta hai, agar hum constuctor ki value true kar dete hai to previous data bhi store rahegi.
         FileOutputStream fout = new FileOutputStream("ab.txt",true);
        String s = "How are you ";
        s=s.concat("hello to kaise hai aap log ");

        byte b[] = s.getBytes();
        fout.write(b);

        /*for(int i=0; i<b.length;i++){
            fout.write(b[i]);
        }*/
         FileInputStream fin = new FileInputStream("ab.txt");
         int m = fin.read();

         while(m != -1){
            System.out.print((char)m);
            m = fin.read();
         }
    }
}