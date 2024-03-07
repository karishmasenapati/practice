/*3. Write a program to find the number of vowels, consonents, digits and white space characters in a string.*/

import java.util.Scanner;

public class Prb3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        countCharacters(inputString);
        scanner.close();
    }
    private static void countCharacters(String inputString) {
        
        inputString = inputString.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

    
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

      
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            else if ((ch >= 'a' && ch <= 'z') && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                consonantCount++;
            }
            else if (Character.isDigit(ch)) {
                digitCount++;
            }
     
            else if (Character.isWhitespace(ch)) {
                spaceCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("White space characters: " + spaceCount);
    }
}
