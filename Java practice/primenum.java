// Prime number in java

public class primenum {
    public static void main(String[] args) {
        int i,m,flag = 0;
        int n = 23;
        m = n/2;
        if(n == 0 || n == 1){
            System.out.println(n+" is not prime number");
        }
        else{
            for(i=2;i<=m;i++){
                if(n % i == 0){
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not prime number");
            }
        }
    }
}
