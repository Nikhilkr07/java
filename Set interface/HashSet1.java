// Program of HashSet it is unOrder list

import java.util.*;

public class HashSet1{
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // System.out.println(hs);

        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");  
        hs.add("five");
        hs.add("one");  // Remove Dupicacy

        System.out.println(hs);

        Iterator i = hs.iterator();

        while (i.hasNext()) {
            System.out.print(i.next()+", ");
        }
    }
}