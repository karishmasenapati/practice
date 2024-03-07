/*1. Take 10 integer inputs from user and store them in an array and print them on screen.*/

import java.util.Scanner;

public class Prg1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("The entered integers are:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
