/* Initialize 2 by 2 String array by user and find those values which are having more than two character
as same (Repeating digit more than one) */

package com.practice;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        String s[][] = new String[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elemets in array");
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s[i].length ; j++){
                s[i][j] = sc.nextLine();
            }
        }

        String s1 = "";
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s[i].length; j++){
                s1 = s[i][j];

                for(int k = 0; k < s1.length(); k++){
                    int c = 0;
                    for(int m = k+1; m < s1.length(); m++){
                        if(s1.charAt(k) == s1.charAt(m)){
                            System.out.println(s1);
                            c++;
                            break;
                        }
                    }
                    if(c > 0){
                        s1 ="";
                        break;
                    }
                }
            }
        }
    }

}
