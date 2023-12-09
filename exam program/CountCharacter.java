// Write a program to find total count of character  'a' in string s = "abcabc" using indexOf method only.

public class CountCharacter {
        public static void main(String[] args) {
            String s = "abcabcaaaaahtra";
        int count = 0;

        // Iterate over the string and increment the count variable each time we encounter the character 'a'.
        int index = s.indexOf('a');
        while (index != -1) {
            count++;
            index = s.indexOf('a', index + 1);
            // System.out.println(s.indexOf('a', index + 1));
            // System.out.println(index);
        }

        // Print the count variable.
        System.out.println(count);
        }
    }
    
