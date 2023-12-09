// LinkedHashMap program

import java.util.*;
public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();

        lhm.put(111, "Nikhil");
        lhm.put(112, "Vishal");
        lhm.put(113, "Niraj");
        lhm.put(115, "Akash");
        lhm.put(114, "Anand");
        lhm.put(116, "Sandeep");

        lhm.put(113, "Chandan"); // Update the value of key 003

        System.out.println(lhm);

        Set s = lhm.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext()) {
            Map.Entry m = (Map.Entry)i.next();
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}

// IN LInkedHashMap element insert in insertion order but in in case of HashMap their is no insertion oreder.