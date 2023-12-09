// Parent of all exception (Exception)

public class Exp3 {
    public static void main(String[] args) {
        int a[] = {1,2};
        try{
            System.out.println("First");
            int i=6/a[5];
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("last");
    }
}
