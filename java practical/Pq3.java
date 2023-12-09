/* Write a program to read value from a file only those digits which are combination of more then two digits */

import java.io.*;
public class Pq3 {
    public static void main(String[] args)throws Exception{
        File f = new File("a.txt");
       
        FileReader fr = new FileReader(f);

        int m;
        String s ="";

        while((m = fr.read()) != -1){
            s += (char)m;
        }
        System.out.println(s);
        
        int count = 0;

        String s1 = "";
        int l = s.length();
        // System.out.println(l);
        int last = 0;

        for(int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            last++;
            //System.out.println("l is " + last);
            if(Character.isDigit(c)){
                s1  += c;
                count++;
                if(count >= 3 && (!(Character.isDigit(s.charAt(i+1))) || last == l -1)){
                    if(last == l-1 && (Character.isDigit(s.charAt(i+1)))){
                        s1 += s.charAt(i+1);
                        System.out.println(s1);
                        break;
                    }
                    else{
                   System.out.println(s1);
                    }
                   
                }
            }
            else{
                count = 0;
                s1 = "";
            }
        }
    }
}
