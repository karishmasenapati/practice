/*1. Write a program to check if the letter 'e' is present in the word 'Umbrella'.*/

public class Prb1 {
    public static void main(String[] args) {
       
        String word = "Umbrella";

        boolean isPresent = isLetterPresent(word, 'e');
        if (isPresent) {
            System.out.println("'e' is present in the word.");
        } else {
            System.out.println("'e' is not present in the word.");
        }
    }

  
    private static boolean isLetterPresent(String word, char letter) {
        word = word.toLowerCase();
        return word.contains(Character.toString(letter).toLowerCase());
    }
}
