/*6. Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.
*/

import java.util.Scanner;

public class Prg6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long product = 1;
        String input;

        System.out.println("Enter integers or press 'q' to quit:");

        while (true) {
            input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
        }

        double average = count > 0 ? (double) sum / count : 0;

        System.out.println("Average: " + average);
        System.out.println("Product: " + product);

        scanner.close();
    }
}