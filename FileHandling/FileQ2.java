// Data read from file and find how many lines in the file.

import java.io.*;

class FileQ2{
    public static void main(String[] args)throws Exception {
        File f = new File("a.txt");

        FileReader fr = new FileReader("a.txt");

        int i;
        int c = 1; // Isliye c =1 rakhein hai kyonki last line ke baad -1 aa jata hai or use last line ke baad \n nahi milti hai (yani new line) isilye count ko chahe 1 se initialize kar do ya to print karte time count+1 karwa do
        while((i = fr.read()) != -1){
            if(i == 10){
                c++;
            }
        }

        System.out.println(c);
    }
}