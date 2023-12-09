/* We have String suppose String s = "12pq987mn" write a program to print sum of even values in this string and multiplication of all the odd values.*/

public class Question2 {
    public static void main(String[] args) {
        String s = "12pq987mn";

        int sum = 0;
        int mul = 1;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                int x = Character.getNumericValue(c);
                if(x %2 == 0){
                    sum += x;
                }
                else{
                    mul *= x;
                }
            }
        }
        System.out.println("Sum of all even digits are "+ sum);
        System.out.println("the multiplication of all odd digits are  "+ mul);

    }    
}
