/*22.	WAP for following OUTPUT 
String s="san12may4tya7yyy678rtb62tp"
Output 2 will 4*7=28
Output 1 will sanmytrbp
Output 3 will 12+678+62=690+62 =....
 */
public class Question22 {
    public static void main(String[] args) {
        String s = "san25gr365ref5hj6tr3gh410lio9655";
        int last = 0;
        String s1 = "";
        int l = s.length();
        int count = 0;
        int sum = 0;
        int mul = 1;
        int value = 0;
        int store = 0;

        for(int i = 0; i < l; i++){
            char c = s.charAt(i);
            last++;
            if(Character.isDigit(c)){
                count++;
                int x = Character.getNumericValue(c);
                if(count >= 2 &&(!(Character.isDigit(s.charAt(i+1))) || last == l-1)){
                    if(last == l-1 && (Character.isDigit(s.charAt(i+1)))){
                        int x1 = Character.getNumericValue(s.charAt(i+1));
                        System.out.println(value);
                       store = (value * 10)+x;
                       store = (store * 10) + x1;
                        sum += store;
                    break;
                    }
                    else{
                        store = (value * 10)+x;
                        value = store;
                        sum += store;
                    }
                }
                else if(count == 1 && (!(Character.isDigit(s.charAt(i+1))))){
                    mul = mul*x;
                }

                else{
                    if(count > 1){
                       store = (value*10)+x;
                       value = store;
                    }
                    else{
                    value = x;
                    }
                    
                }
            }
            else{
                s1 = s1 + c; 
                count = 0;
            }
        }

        String result = "";

        for(int i = 0; i < s1.length(); i++){
            String ch = ""+s1.charAt(i);
            
            if(result.contains(ch)){
                continue;
            }
            result += ch;
        }
        System.out.println("String: "+s);
        System.out.println("OUTPUT 1: "+result);
        System.out.println("OUTPUT 2: "+mul);
        System.out.println("OUTPUT 3: "+sum);
    }
}

//another way

/*22.	WAP for following OUTPUT 
String s="san12may4tya7yyy678rtb62tp"
Output 2 will 4*7=28
Output 1 will sanmytrbp
Output 3 will 12+678+62=690+62 =....

public class A {
    public static void main(String[] args) {
        String s = "san12may4tya7yyy678rtb62tp";
        int last = 0;
        String s2 = "";
        int l = s.length();
        int count = 0;
        int sum = 0;
        int mul = 1;
        int value = 0;
        int store = 0;
        String s1 = "";
        int al = 0;

        System.out.println(al);

        String sa[] = new String[3];
        int sac = 0;

        for(int i = 0; i < l; i++){
            char c = s.charAt(i);
            last++;
            if(Character.isDigit(c)){
                int x = Character.getNumericValue(c);
                s1  += c;
                count++;
                if(count >= 2 && (!(Character.isDigit(s.charAt(i+1))) || last == l -1)){
                    if(last == l-1 && (Character.isDigit(s.charAt(i+1)))){
                        s1 += s.charAt(i+1);
                        sa[sac] = s1;
                        sac++;
                        System.out.println(s1);
                        break;
                    }
                    else{
                   System.out.println(s1);
                   sa[sac] = s1;
                        sac++;
                    }
                   
                }
                else if(count == 1 && (!(Character.isDigit(s.charAt(i+1))))){
                    mul = mul*x;
                }
            }
            else{
                s2 = s2 + c; 
                count = 0;
                sum = 0;
                s1 = "";
            }
        }

        int count1 = 0;
        for(int i = 0 ; i < sa.length; i++){
            for(int j = 0; j < sa[i].length(); j++){
                char c1 = sa[i].charAt(j);
                int x = Character.getNumericValue(c1);
                count1 ++;
                if(count1 >=2 ){
                    store = (value*10)+x;
                    value = store;
                    // System.out.println("value "+value);
                }
                else{
                    value = x;
                }
            }
            count1 = 0;
            sum += store;
        }

        // System.out.println(s2);
        String result = "";

        for(int i = 0; i < s2.length(); i++){
            String ch = ""+s2.charAt(i);
            
            if(result.contains(ch)){
                continue;
            }
            result += ch;
        }
        System.out.println("OUTPUT 1: "+result);
        System.out.println("OUTPUT 2: "+mul);
        System.out.println("OUTPUT 3: "+sum);
    }
}


 */