/*7. Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
*/

import java.util.Scanner;

public class Prg7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        int min = Math.min(num1, num2);
        
        int gcd = 1;
        
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        
        scanner.close();
    }
}