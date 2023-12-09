/*Wap to initlize two integer array of user enterd size .Then perform following operations
1.add elements in that array which  is longest .
I.e. if first array is of 3 size having elements 1,2,3
Second array is of size five and elements are 4,5,6,7,8
Than result array will second and now it's elements will 5,7,9,7,8
 */

import java.util.*;

public class Question24 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1: ");
        n1 = sc.nextInt();
        System.out.print("Enter size of arrar2: ");
        n2 = sc.nextInt();

        int a1[] = new int[n1];
        int a2[] = new int[n2];

        System.out.println("Enter "+n1+" element in array1 ");
        for(int i = 0; i < n1; i++){
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter "+n2+" element in array2 ");
        for(int i = 0; i < n2; i++){
            a2[i] = sc.nextInt();
        }

        if(n1 > n2){
            for(int i = 0; i < n2; i++){
                a1[i] = a1[i] + a2[i];  
            }
            System.out.println("Array one is longest and after than Array1 is : ");
            for(int i = 0; i < n1; i++){
                System.out.print(a1[i]+", ");
            }
        }
        else if(n1 < n2){
            for(int i = 0; i < n1; i++){
                a2[i] = a2[i] + a1[i];
            }
            System.out.println("Array two is longest and after than Array2 is : ");
            for(int i = 0; i < n2; i++){
                System.out.print(a2[i]+", ");
            }
        }

        
    }    
}
