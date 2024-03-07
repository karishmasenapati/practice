/*4. Write a program to check if a given string is a Palindrome.
A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.*/

import java.util.Scanner;

public class Prb4 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }

    private static boolean checkPalindrome(String inputString) {
   
        String cleanString = inputString.replaceAll("\\s", "").toLowerCase();
        int start = 0;
        int end = cleanString.length() - 1;

   
        while (start < end) {
            if (cleanString.charAt(start) != cleanString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
