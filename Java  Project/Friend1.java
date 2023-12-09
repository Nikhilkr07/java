import java.net.*;
import java.io.*;
import java.util.*;

public class Friend1 {
    public static void main(String[] args)throws Exception {
        Socket s = new Socket("localhost",1000);
        Scanner sc = new Scanner(System.in);

        while (true) {

        System.out.print("send : ");
        String msg = sc.nextLine();

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF(msg);
        
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String m = dis.readUTF();
        System.out.println(m);

        if(m.equalsIgnoreCase("bye")){
            break;
        }
        }
    
    }    
}
