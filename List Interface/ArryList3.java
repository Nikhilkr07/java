// Traversal using for loop and for each loop

import java.util.ArrayList;

public class ArryList3 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(10.5);
        al.add(10);
        al.add("nikhil");
        al.add("sumit");

        System.out.println(al);

        System.out.println("traversal using for loop");
        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }

        /*using for each loop */
        System.out.println("traversal using for each loop");
        for(Object o : al){
            System.out.println(o);
        }
    }
}
