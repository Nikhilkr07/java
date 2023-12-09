// Client passing a string numbric value to server and request to server send me its factorial number

import java.net.*;
import java.io.*;
import java.util.*;

public class Client1 {
    public static void main(String[] args)throws Exception {
        Socket s = new Socket("localhost",2000);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        System.out.println("Send which number factorial you want: ");
        Scanner sc = new Scanner(System.in);
        dos.writeUTF(sc.next());

        InputStream is = s.getInputStream();
        DataInputStream dis =  new DataInputStream(is);
        System.out.println("Server Response is:\n");
        String m = dis.readUTF();
        System.out.println(m);
    }    
}
