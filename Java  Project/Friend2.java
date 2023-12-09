import java.net.*;
import java.io.*;
import java.util.*;

public class Friend2{
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(1000);
        while (true) {
        Socket s = ss.accept();
        System.out.println(" start ");
        Scanner sc = new Scanner(System.in);
        while(true){
  
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String m = dis.readUTF();
        System.out.println(m);

        System.out.print("send : ");
        String msg = sc.nextLine();

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF(msg);

        if(m.equalsIgnoreCase("bye")){
            break;
        }
        }

    }

    }
}