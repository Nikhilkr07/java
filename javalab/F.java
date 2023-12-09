// Write a program we have two file suppose a nad b we read data from file a and wirte to file be if a file a consist more than 50 character we have ingnore after 50 character and if file a consist less than 50 character then we write data furture till the b consist 50 character. after copy print it into reverse order.
 
import java.io.*;

class F{
    public static void main(String[] args)throws Exception {
        File f1 = new File("a.txt");
        File f2 = new File("b.txt");

        //f1.createNewFile();
        //f2.createNewFile();

        FileWriter fw = new FileWriter("b.txt",true);

        FileReader fr = new FileReader("a.txt");

        long l1 = f1.length();
        int i;
        int c = 0;

        String s1 = "";

        while((i = fr.read()) != -1 && c < 50){
            fw.write(i);
            char c2 = (char)i;
            s1 = s1 + c2;
            c++;
        }
        // System.out.println(s1);

        if(c < 50){
        while(c < 50){
            for(int j = 0; j<s1.length();j++){
                char c3 = s1.charAt(j);
                fw.append(c3);
                c++;
                if(c == 50){
                    break;
                }
            }
        }
    }

        fw.close();

        //File f3 = new File("b.txt");

        FileReader fr1 = new FileReader("b.txt");

        String s = "";

        int k;
        while((k = fr1.read()) != -1){
            char c1 = (char)k;
            s = s +c1; 
        }
        System.out.println(B.rev(s));

    }
}

class B{
    static String rev(String s){
        return new StringBuffer(s).reverse().toString();
    }
}