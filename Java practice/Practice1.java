

public class Practice1 {
    public static void main(String[] args) {
        String s = "abfg156ghe26za";

        float sum = 0;
        float avg = 0;
        int ct = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int x = Character.getNumericValue(c);
                sum += x;
                ct++;
            }
            else if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                if(c == 'a' || c == 'A'){
                    int x = c;
                    System.out.print((char)(x+25));
                }
                else{
                    int x = c;
                    System.out.print((char)(x-1));
                }
            }
            else{
                if(c == 'z' || c == 'Z'){
                    int x = c;
                    System.out.print((char)(x-25));
                }
                else{
                    int x = c;
                    System.out.print((char)(x+1));
                }
            }
        }
        avg = sum/ct;
        System.out.println("\nAvg is "+ avg);
        // expected output zcghhidaz
    }
}
