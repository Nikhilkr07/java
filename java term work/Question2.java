/*2.	WAP in Java to initialize a string in order to find that character which frequency is 2nd most in that string. */
// import java.util.*;

// public class Question2 {

//     public static void main(String[] args) {
//         String str = "abcdeaabttbccddfdtt";

//         Map<Character, Integer> frequencyMap = new HashMap<>();
//         for (char c : str.toCharArray()) {
//             // System.out.println(c);
//             System.out.println(frequencyMap.containsKey(c));
//             if (frequencyMap.containsKey(c)) {
//                 frequencyMap.put(c, frequencyMap.get(c) + 1);
//             } else {
//                 frequencyMap.put(c, 1);
//             }
//         }

//         int maxFrequency = 0;
//         char maxFrequencyCharacter = '\0';
//         int secondMaxFrequency = 0;

//         for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
//             int frequency = entry.getValue();
//             if (frequency > maxFrequency) {
//                 secondMaxFrequency = maxFrequency;
//                 maxFrequency = frequency;
//                 maxFrequencyCharacter = entry.getKey();
//             } else if (frequency > secondMaxFrequency) {
//                 secondMaxFrequency = frequency;
//             }
//         }

//         char secondMostFrequentCharacter = '\0';
//         for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
//             if (entry.getValue() == secondMaxFrequency) {
//                 secondMostFrequentCharacter = entry.getKey();
//                 break;
//             }
//         }

//         System.out.println("The character with the second most frequency is: " + secondMostFrequentCharacter);
//     }
// }

// public class Question2{
//     public static void main(String[] args) {
//         String s = "nikhilil";
        
//         int l = s.length();
//         int count = 0;
//         char c[] = new char[l];

//         for(int i = 0 ; i < s.length(); i++){
//             char c1  = s.charAt(i);
//             c[count] = c1;
//             count++;
//         }
//         char temp;

//         for(int i = 0 ; i < c.length; i++){
//             for(int j = 0; j < c.length-1-i; j++){
//                 if(c[j]>c[j+1]){
//                     temp = c[j];
//                     c[j] = c[j+1];
//                     c[j+1] = temp;
//                 }
//             }
//         }
//         int count1 = 1;
//         int count2 = 1;
//         int fc = 1;
//         char fchar = '/',fchar1 = '/';
//         for(int i = 0; i < c.length-1; i++){
//             if(c[i] == c[i+1]){
//                 count1++;
//                 if(count1 > fc || count1 == fc){
//                     if(count1 > fc){
//                         fchar = c[i];
//                         fc = count1;
//                     }
//                     else if(count1 == fc){
//                     fchar1 = c[i];
//                     fc = count1;
//                     }
//                 }
//             }
//             else{
                
//                 count1 = 1;
//             }

//         }
//         System.out.println(fchar1);
       
//     }
// }


