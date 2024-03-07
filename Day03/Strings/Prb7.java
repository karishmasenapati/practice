/*7. Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.*/

import java.util.Scanner;

public class Prb7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the substring to replace: ");
        String oldSubstring = scanner.nextLine();
        System.out.print("Enter the new string: ");
        String newSubstring = scanner.nextLine();
        String newSentence = replaceSubstring(sentence, oldSubstring, newSubstring);
        System.out.println("New Sentence: " + newSentence);
        scanner.close();
    }

    private static String replaceSubstring(String sentence, String oldSubstring, String newSubstring) {
      
        return sentence.replace(oldSubstring, newSubstring);
    }
}
