// /*6.	WAP to create a method check which returns two values.If first string having a character twice as well second string also then return both the string by removing that character? */

// import java.util.Arrays;

// public class Question6 {
    
//     public static String[] check(String str1, String str2) {
//         for (char c : str1.toCharArray()) {
//             if (str1.indexOf(c) != str1.lastIndexOf(c) && str2.indexOf(c) != str2.lastIndexOf(c)) {
//                 str1 = str1.replace(Character.toString(c), "");
//                 str2 = str2.replace(Character.toString(c), "");
//                 return new String[]{str1, str2};
//             }
//         }
//         return null;
//     }

//     public static void main(String[] args) {
//         String str1 = "san12may4tya7yyy678rtb62tp";
//         String str2 = "san12may4tya7yyy678rtb62tp";
//         String[] result = check(str1, str2);
//         if (result != null) {
//             System.out.println(Arrays.toString(result));
//         } else {
//             System.out.println("No common characters found");
//         }
//     }
// }


import java.util.*;   
  
//Creating Question6 class  
class Question6    
{   
    //Creating removeDuplicates() method to remove duplicates from array  
    static void removeDuplicate(char str[], int length)   
    {   
        //Creating index variable to use it as index in the modified string   
        int index = 0;   
    
        // Traversing character array  
        for (int i = 0; i < length; i++)   
        {   
              
            // Check whether str[i] is present before or not   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            // If the character is not present before, add it to resulting string   
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    
    // main() method starts  
    public static void main(String[] args)   
    {   
        String info = "javaTpoint is the best learning website";  
        //Converting string to character array  
        char str[] = info.toCharArray();  
        //Calculating length of the character array  
        int len = str.length;   
        //Calling removeDuplicates() method to remove duplicate characters  
        removeDuplicate(str, len);   
    }   
} 