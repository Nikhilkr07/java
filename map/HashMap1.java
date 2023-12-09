// This is first hashMap program
import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();

        hm.put("001", "Nikhil");
        hm.put("002", "Vishal");
        hm.put("003", "Niraj");
        hm.put("005", "Akash");
        hm.put("004", "Anand");
        hm.put("006", "Sandeep");

        hm.put("003", "Chandan"); // Update the value of key 003

        System.out.println(hm);
        System.out.println(hm.containsKey("001"));
        System.out.println(hm.containsKey("007"));
        System.out.println(hm.size());

        /*Get keys of HashMap */
        Set s = hm.keySet();

        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println("Keys are = "+i.next());
        }

        /*Get values of HashMap */
        Collection c = hm.values();
        Iterator i1 = c.iterator();
        while (i1.hasNext()) {
            System.out.println("Values = "+ i1.next());
        }

        /*Remove element */
        //System.out.println(hm.remove("005"));

        // System.out.println(hm);
        System.out.println(hm.get("002"));

        Set s1 = hm.entrySet();
        Iterator i2 = s1.iterator();
        while (i2.hasNext()) {
            Map.Entry m = (Map.Entry)i2.next();
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}