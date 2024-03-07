/*5. Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *. (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”.*/

import java.util.Scanner;

public class Prg5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

 
        if (isPalindrome(inputString)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            String replacedString = replacePalindromes(inputString);
            System.out.println("Replaced string: " + replacedString);
        }
        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    private static String replacePalindromes(String inputString) {
        String[] words = inputString.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (isPalindrome(word)) {
                result.append("*".repeat(word.length())).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}

