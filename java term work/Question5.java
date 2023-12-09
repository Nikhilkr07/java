/*5.	WAP to delete only those text file which are non empty in these folder.[E://MCA/BCA/DCA]. */

import java.io.*;

public class Question5 {
    public static void main(String[] args)throws Exception {
        File f1 = new File("D:/mca/m.txt");
        File f2 = new File("D:/mca/bca/b.txt");
        File f3 = new File("D:/mca/bca/dca/d.txt");
        
        if(f1.length() == 0){
            System.out.println("file D:/mca/m.txt is empty");
        }
        else if(f1.length() > 0){
            boolean b = f1.delete();
            if(b){
            System.out.println("File D:/mca/m.txt is deleted SuccessFully!!");
            }
            else{
                System.out.println("File D:/mca/m.txt is not delete");
            }
        }

        if(f2.length() == 0){
            System.out.println("file D:/mca/bca/b.txt is empty");
        }
        else if(f2.length() > 0){
            boolean b = f2.delete();
            if(b){
            System.out.println("File D:/mca/bca/b.txt is deleted SuccessFully!!");
            }
            else{
                System.out.println("File D:/mca/bca/b.txt is not delete");
            }
        }

        if(f3.length() == 0){
            System.out.println("file D:/mca/bca/dca/d.txt is empty");
        }
        else if(f3.length() > 0){
            boolean b = f3.delete();
            if(b){
            System.out.println("File D:/mca/bca/dca/d.txt is deleted SuccessFully!!");
            }
            else{
                System.out.println("File D:/mca/bca/dca/d.txt is not delete");
            }
        }

        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f3.exists());
        
    }
}
