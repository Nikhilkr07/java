
import java.io.*;

public class Practice3 {
    public static void main(String[] args)throws Exception {
        File f = new File("a.txt");
        //f.createNewFile();

        FileReader fr = new FileReader(f);
        int m;

        long l = f.length();
        // System.out.println(l);
        
        String s = "";
        while((m = fr.read()) != -1){
            char c = (char)m;
            s += c;
        }
        System.out.println(s);

        int last = 0;
        int count = 0;
        String s1 = "";
        for(int i = 0; i< s.length()-1;i++){
            char c = s.charAt(i);
            last++;
            if(Character.isDigit(c)){
                s1 +=c;
                count++;
                if(count >= 3 && (!(Character.isDigit(s.charAt(i+1))) || last == l-1)){
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
