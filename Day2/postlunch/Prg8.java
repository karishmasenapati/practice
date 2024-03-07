/*8. Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest*/

import java.util.Scanner;

public class Prg8 {
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

      
        int maxDifference = Integer.MIN_VALUE;
        int minDifference = Integer.MAX_VALUE;
        int maxDiffIndex1 = 0, maxDiffIndex2 = 1;
        int minDiffIndex1 = 0, minDiffIndex2 = 1;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int difference = Math.abs(numbers[i] - numbers[j]);

              
                if (difference > maxDifference) {
                    maxDifference = difference;
                    maxDiffIndex1 = i;
                    maxDiffIndex2 = j;
                }

               
                if (difference < minDifference) {
                    minDifference = difference;
                    minDiffIndex1 = i;
                    minDiffIndex2 = j;
                }
            }
        }

      
        System.out.println("\nPair with Maximum Difference:");
        System.out.println("Element 1: " + numbers[maxDiffIndex1] + ", Element 2: " + numbers[maxDiffIndex2]);
        System.out.println("Maximum Difference: " + maxDifference);

        System.out.println("\nPair with Minimum Difference:");
        System.out.println("Element 1: " + numbers[minDiffIndex1] + ", Element 2: " + numbers[minDiffIndex2]);
        System.out.println("Minimum Difference: " + minDifference);
    }
}
