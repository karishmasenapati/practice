/*1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.*/

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        printMaximumNumber(num1, num2, num3);
        printMinimumNumber(num1, num2, num3);
        scanner.close();
    }
    private static void printMaximumNumber(double num1, double num2, double num3) {
        double max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Maximum number: " + max);
    }

    private static void printMinimumNumber(double num1, double num2, double num3) {
        double min = Math.min(Math.min(num1, num2), num3);
        System.out.println("Minimum number: " + min);
    }
}

