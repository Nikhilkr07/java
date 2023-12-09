
import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        String s[][] = new String[2][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values from String array ");

        for(int i = 0; i< s.length;i++){
            for(int j = 0; j<s[i].length;j++){
                s[i][j] = sc.nextLine();
            }
        }

        for(int i = 0; i< s.length;i++){
            for(int j = 0; j< s[i].length;j++){
                String s1 = s[i][j];
                int c =0;
                for(int k = 0; k<s1.length();k++){
                    for(int m = k+1; m<s1.length();m++){
                        if(s1.charAt(k) == s1.charAt(m)){
                            System.out.println("Repeated character in values is "+s1);
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
