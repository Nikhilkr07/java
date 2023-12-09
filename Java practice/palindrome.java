// Palindrome number in java

public class palindrome{
    public static void main(String[] args){
        int rev = 0, a = 0;
        int n = 123;
        int temp = n;
        while(n > 0){
            a = n % 10;
            rev = (rev * 10) + a;
            n = n / 10;
        }

        // System.out.println(rev);

        if(temp == rev){
            System.out.println("The number is palindrome number");
        }
        else{
            System.out.println("The number is not a palindrome number");
        }
        
    }
}
