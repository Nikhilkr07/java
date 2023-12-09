// here actual Socket programming we create two class one is client and another is server client sends a request to server and server reply it here in this example client pass some string value to server and then server reply the msg to string corresponding this string in uppercase

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket s = new Socket("localhost",1000);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        // dos.writeUTF("hello how are you ");
        // this msg is passing through run time using Scanner class
        System.out.println("Send Value(msg) in small and server will send in capital");
        Scanner sc = new Scanner(System.in);
        dos.writeUTF(sc.nextLine());
        InputStream is = s.getInputStream();
        DataInputStream dis =  new DataInputStream(is);
        System.out.println("Server Response is:\n");
        String m = dis.readUTF();
        System.out.println(m);
    }    
}
