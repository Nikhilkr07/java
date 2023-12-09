// Here in this folder i started Socket Programming
// This is first Socket programming.
import java.net.*;

public class S1{
    public static void main(String[] args) throws Exception {
        InetAddress ia = InetAddress.getLocalHost();
        // ia.getByName("WWW.yahoo.com");
        ia.getHostName();
        ia.getHostAddress();
        System.out.println(ia);
    }
}