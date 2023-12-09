import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
         String s;
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    
    int sum = 0;
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);

        if(Character.isDigit(c)){
            int x = Character.getNumericValue(c);

            sum +=x; 
        }
        else{
            System.out.print(c);
        }
    }
    System.out.println("Sum is" + sum);
    }
    
}
