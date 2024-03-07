/*2. Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.*/

import java.util.Scanner;

public class Prg2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

 
        System.out.print("Enter a number to search in the array: ");
        int searchNumber = scanner.nextInt();
        scanner.close();

        boolean isNumberPresent = false;

        for (int number : numbers) {
            if (number == searchNumber) {
                isNumberPresent = true;
                break;
            }
        }

    
        if (isNumberPresent) {
            System.out.println(searchNumber + " is present in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }
    }
}
