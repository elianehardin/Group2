package GProjet2;

import java.util.ArrayList;
import java.util.List;

public class C {


    /*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
 */

        public static char findFirstNonRepeatingChar(String str) {
            List<Character> charList = new ArrayList<>();
            List<Character> nonRepeatingChars = new ArrayList<>();

            for (char c : str.toCharArray()) {
                if (charList.contains(c)) {
                    nonRepeatingChars.remove((Character) c);
                } else {
                    charList.add(c);
                    nonRepeatingChars.add(c);
                }
            }

            if (!nonRepeatingChars.isEmpty()) {
                return nonRepeatingChars.get(0);
            } else {
                return '\0';
            }
        }

        public static void main(String[] args) {
            String input = "abracadabra";
            char firstNonRepeatingChar = findFirstNonRepeatingChar(input);

            if (firstNonRepeatingChar != '\0') {
                System.out.println(firstNonRepeatingChar);
            } else {
                System.out.println("No non-repeating character found in the string.");
            }
        }}





