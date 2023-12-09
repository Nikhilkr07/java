// here is write the server side logic

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(1000);
        System.out.println("Start");
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String m = dis.readUTF();
        System.out.println(m);

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF(m.toUpperCase());
        dos.close();
    }    
}
