//Fibonacci Series in java

public class fibonacciseries{
    public static void main(String[] args) {
        int a = 0,b = 1, c, i;
        int num = 10;

        for(i=1;i<=num;i++){
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}