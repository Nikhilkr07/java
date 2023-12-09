// Factorial of a number

public class factorial {
    public static void main(String[] args){
        int i,n,f = 1;
        n = 6;
        for(i=1;i<=n;i++){
            f = f * i;
        }
        System.out.println("Factorial of " + n +" is " + f);
    }
}
