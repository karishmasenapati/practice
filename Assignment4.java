/*4. Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.*/

import java.util.Scanner;

public class CalculateMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1 = ");
        int subject1= scanner.nextInt();

        System.out.print("Enter marks for Subject 2 =");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3 =");
        int subject3 = scanner.nextInt();

       
        int totalMarks = subject1 + subject2 + subject3;

        double percentage = (double) totalMarks / 300 * 100;

        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
