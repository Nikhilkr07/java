// create a file

import java.io.File;

public class F1 {
    public static void main(String[] args)throws Exception {
        // CreateNewFile(); method

        File f = new File("a.txt");
        // System.out.println(f.createNewFile());
        System.out.println(f.lastModified());

        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

        File f1 = new File("D:\\java program\\Class code\\Inputoutput\\bca");
       // System.out.println(f1.mkdir());
       System.out.println(f1.isDirectory());


    }
}
