package p;
import  q.B;

public class A {
    public static void main(String args[]) {
        try {
//          age(19);
            age(10);
        } catch (B e) {
            System.out.println(e.getMessage());
        }
    }
        private static void age(int a) throws B{
            if(a < 18){
                System.out.println("Exception Occurred ");
                throw new B("invalid age for voting");
            }
            else{
                System.out.println("Valid for voting");
            }
        }
}

