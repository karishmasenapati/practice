/*5. Write a program to find the sum and product of all elements of an array.*/
import java.util.Scanner;

public class Prg5 {
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
        int sum = 0;
        long product = 1;

        for (int number : numbers) {
            sum += number;
            product *= number;
        }

        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Product of the array elements: " + product);
    }
}
