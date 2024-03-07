/*8. Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner.*/

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();
        scanner.close();
        int firstDigit = Character.getNumericValue(Integer.toString(number).charAt(0));
        int secondLastDigit = Character.getNumericValue(Integer.toString(number).charAt(3));

    
        int sum = firstDigit + secondLastDigit;

        System.out.println("Sum of the first and second last digit: " + sum);
    }
}
