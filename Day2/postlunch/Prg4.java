/*4. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.*/
 

import java.util.Scanner;

public class Prg4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        scanner.close();

 
        int[] reversedArray = new int[10];

      
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }

  
        System.out.println("\nOriginal Array:");

        for (int number : originalArray) {
            System.out.print(number + " ");
        }

        System.out.println("\nReversed Array:");

        for (int number : reversedArray) {
            System.out.print(number + " ");
        }
    }
}
