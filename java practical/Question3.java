/*Write a program in java to find the sum of three sequence of digits if it occurs in a String eg; in given
String s = "12mp379lm9x89";  here three digits in sequence is 379 find its sum and print"*/

public class Question3 {
    public static void main(String[] args) {
        String s = "12mp379lm9x89xyz563 ";
        int l = s.length();
        int count = 0;
        int sum = 0;
        for(int i = 0; i < l; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                count++;
                int x = Character.getNumericValue(c);
                sum = sum + x;
                char check = s.charAt(i+1); // check the next element if it is digit so there are 4 consecutive so skip it
                if(count == 3 && !Character.isDigit(check)){
                    System.out.println(sum);
                }
            }
            else{
                count = 0;
                sum = 0;
            }
        }
    }
}

