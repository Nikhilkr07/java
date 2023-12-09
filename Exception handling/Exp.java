//Exception handling (Arithmetic Exception)

class Exp{
    public static void main(String[] args) {
        System.out.println("First");
        try{
        int i = 6/Integer.parseInt(args[0]);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("last");
    }
}
