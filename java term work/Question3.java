/*3.	WAP to check longest sub sequence of a same character in an initialized string?[aaaabppppp, p=5] [aabbcc, a=2]. */

public class Question3 {

    public static void longestSubSuequece(String str) {
        // if (str == null || str.isEmpty()) {
        //     System.out.println("Invalid input string");
        //     return;
        // }

        char currentChar = str.charAt(0);
        char longestChar = currentChar;
        int currentCount = 1;
        int longestCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentCount++;
            }
            else {
                currentChar = str.charAt(i);
                currentCount = 1;
            }
            if (currentCount > longestCount) {
                longestCount = currentCount;
                longestChar = currentChar;
            }
        }

        System.out.println("For the string '" + str + "', the longest subsequence is: " + "[" + longestChar + "=" + longestCount + "]");
    }

    public static void main(String[] args) {
        String s1 = "aaaaaabppppp";
        String s2 = "aabbbbbcckkkk";
        System.out.println("String1: "+s1);
        System.out.println("String2: "+s2);

        longestSubSuequece(s1);
        longestSubSuequece(s2);
    }
}


