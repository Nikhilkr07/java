// A is a Server
import java.net.*;

public class A {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(2000);// (portNumber)
        Socket s = ss.accept();
        System.out.println(s);
    }
}
