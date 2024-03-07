/*7. Find largest and smallest elements of an array.*/

import java.util.Scanner;

public class Prg7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

  
        scanner.close();
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            } else if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
