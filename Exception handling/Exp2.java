// 1 try multipule catch

public class Exp2 {
    public static void main(String[] args) {
        try{
        System.out.println("first");
        int i =9/Integer.parseInt(args[0]);
        System.out.println("last");
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e1){
            e1.printStackTrace();
        }
    }
}
