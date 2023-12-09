
import java.io.*;

public class A2 {
    public static void main(String[] a) throws Exception{
        String s = "";
        for(String i : a){
            s = s+i;
        }

        System.out.println(s);
        int count = 0;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                count++;
                if(count == 2){
                    break;
                }
        }
    }
    if(count == 2){

    File f = new File("a.txt");
    // f.createNewFile();

    FileWriter fw = new FileWriter(f);

    fw.write(s);

    fw.close();
    }
    else{
        for(int i = s.length()-1; i >=0 ; i--){
            System.out.println(s.charAt(i));
        }
    }

}
}
