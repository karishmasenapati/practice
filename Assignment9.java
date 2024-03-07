/*9. Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner.*/

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

 
        int firstDigit = number / 10;
        int secondDigit = (number % 10) / 10;
        int thirdDigit = number % 10;

      
        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println("Sum of the digits: " + sum);
    }
}
