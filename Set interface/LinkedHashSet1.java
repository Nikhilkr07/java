// Program of HashSet it is Order list
/* The difference between the HashSet and LinkedHaseSet is the HashSet is
 unOrderList but the LinkedHashSet is orderList.
  */
import java.util.*;

public class LinkedHashSet1{
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        // System.out.println(hs);

        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        hs.add("one");  // Remove Dupicacy

        System.out.println(hs);
    }
}
