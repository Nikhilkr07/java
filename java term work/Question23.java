/*.  Enter a no and than create array of its digits.
I.e
If no is 123456 than 
Store it's digit in int array of size 6 as 
If array is a than a[0] should 1 and a[1] should 2......
Also after storing in array a then reverse it's all value without using another array i.e 
After reversing a[0] should 6 and a[1] should 5 ......
print common elemnts of both array.
 */

import java.util.*;

public class Question23 {
    public static void main(String[] args) {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers only: ");
        s = sc.nextLine();
        int l = s.length();

        int arr[] = new int[l];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int x = Character.getNumericValue(c);
            arr[i] = x;
            // System.out.println(x);
        }

        /*swaping here */
        int n = arr.length;
        int temp = 0;

        for(int i = 0; i < n/2; i++){
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i -1] = temp;
        }

        System.out.println("arr[0] = "+arr[0]);
        System.out.println("arr[1] = "+arr[1]);
        
    }    
}
