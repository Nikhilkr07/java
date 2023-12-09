//

import java.io.*;

public class ClosableInterface {
    public static void main(String[] args) {
        try(A a = new A();){

        }
    }
}

class A implements Closeable{
    public void close(){
        System.out.println("hi");
    }
}
