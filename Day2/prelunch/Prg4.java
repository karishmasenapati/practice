/*4. Take 10 integers from keyboard using loop and print their average value on the screen.
*/

import java.util.Scanner;

public class Prg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter integer " + i + ":");
            number = scanner.nextInt();
            sum += number;
        }

        double average = sum / 10.0;

        System.out.println("The average value is: " + average);

        scanner.close();
    }
}