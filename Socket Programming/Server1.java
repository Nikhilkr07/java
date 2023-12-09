// here server get(receive) string numeric value from user and server calculate its factorial and send to the client.

import java.net.*;
import java.io.*;

public class Server1 {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        System.out.println("Start");
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String m = dis.readUTF();
        int i = Integer.parseInt(m);
        System.out.println("Client request is find "+i+ " factorial");

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("The factorial of "+ i +" is " +Integer.toString(fact(i)));
        dos.close();
    }    

    static int fact(int n){
        if(n == 0){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }
}
