import java.util.Scanner;

public class S {
    public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s = sc.nextLine();
        int sum=0;
        for(int i=0;i<=s.length();i++)
        {
          char c=s.charAt(i);
          if(Character.isDigit(c))
          {
            int x=Character.getNumericValue(c);
sum +=x;
          }
          else
          System.out.println(c);
        }



    }
    
}
