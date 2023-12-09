// /*5.	WAP to delete only those text file which are non empty in these folder.[E://MCA/BCA/DCA]. */

import java.io.*;

// public class F {
//     public static void main(String[] args)throws Exception {

//         // File f = new File("D:/bca/b.txt");
//         // System.out.println(f.createNewFile());

//         // File f1 = new File("D:/dca/d.txt");
//         // System.out.println(f1.createNewFile());

//         // File f2 = new File("D:/mca/m.txt");
//         // System.out.println(f2.createNewFile());

//         FileReader fr1 = new FileReader("D:/bca/b.txt");
//         int i1 = fr1.read();
//         // while((i1 = fr1.read()) != -1){
//         //     System.out.print((char)i1);
//         // }
//         System.out.println();

//         FileReader fr2 = new FileReader("D:/mca/m.txt");
//         int i2 = fr2.read();
//         // while((i2 = fr2.read()) != -1){
//         //     System.out.print((char)i2);
//         // }
//         System.out.println();

//         FileReader fr3 = new FileReader("D:/dca/d.txt");
//         int i3 = fr3.read();
//         // while((i3 = fr3.read()) != -1){
//         //     System.out.print((char)i3);
//         // }
//         System.out.println();

//         String s ="";
        
//         if(i1 != -1){
//            FileWriter fw1 = new FileWriter("D:/bca/b.txt");
//             // fw1.append(s);
//             System.out.println("hi");
//             // fw1.close();
//         }
//         else{
//             System.out.println("This folder is always empty");
//         }
//         if(i2 != -1){
//            FileWriter fw2 = new FileWriter("D:/mca/m.txt");
//             // fw2.append(s);
//             System.out.println("hello");
//             // fw2.close();
//         }
//         else{
//             System.out.println("This folder is always empty");
//         }
//         if(i3 != -1){
//            FileWriter fw3 = new FileWriter("D:/dca/d.txt");
//             // fw3.append(s);
//             System.out.println("hlk");
//             // fw3.close();
//         }
//         else{
//             System.out.println("This folder is always empty");
//         }
//     }
// }

public class F{
    public static void main(String [] args) throws Exception{
        File f = new File(" D/mca/m.txt");
        System.out.println(f.delete());
    }
}
