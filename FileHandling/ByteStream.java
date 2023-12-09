// Byte Stream in java

import java.util.*;
import java.io.*;

public class ByteStream {
    public static void main(String[] args)throws Exception {
        String s = "abc";
        
        byte b[] = s.getBytes();

        for(byte r : b){
            System.out.println((char)r);
        }
    }    
}
