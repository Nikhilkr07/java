/* Initialize 2 by 2 String array by user and find those values which are having more than two character as same (Repeating digit more than one) */

import java.util.Scanner;

public class Pq2 {
    public static void main(String[] args) {
        String [][] s = new String[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values in the String");

        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s[i].length; j++){
                s[i][j] = sc.nextLine();
            }
        }

        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s[i].length; j++){
                String s1 = s[i][j];
                //System.out.println(s1 +"\n\n");
               // System.out.println(s1.length());
                for(int k = 0; k < s1.length(); k++){
                    int c =0;
                    for(int m = k+1; m < s1.length(); m++ ){
                        if(s1.charAt(k) == s1.charAt(m)){
                            System.out.println("Rpeated charcter in value  "+s1);
                            c++;
                            break;
                        }
                    }
                    if(c > 0){
                        break;
                    }
                }
            }
        }


    }
}
