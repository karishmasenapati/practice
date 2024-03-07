/*2. Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.*/


import java.util.Scanner;

public class Prb2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        String abbreviation = generateAbbreviation(fullName);
        System.out.println("Abbreviation: " + abbreviation);
        scanner.close();
    }


    private static String generateAbbreviation(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length < 2) {
            System.out.println("Invalid full name format.");
            return "";
        }

        StringBuilder abbreviation = new StringBuilder(nameParts[0].charAt(0) + ".");

        for (int i = 1; i < nameParts.length - 1; i++) {
            abbreviation.append(nameParts[i].charAt(0) + ".");
        }

        abbreviation.append(nameParts[nameParts.length - 1]);

        return abbreviation.toString();
    }
}


