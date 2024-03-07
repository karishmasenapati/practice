/*3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/
import java.util.Scanner;
public class Prg3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of classes held:");
        int classesHeld = scanner.nextInt();
        
        System.out.println("Enter the number of classes attended:");
        int classesAttended = scanner.nextInt();
        
        double attendancePercentage = (double) classesAttended / classesHeld * 100;
        
        System.out.printf("Attendance percentage: %.2f%%\n", attendancePercentage);
        
        System.out.println("Do you have a medical cause? (Y/N):");
        char medicalCause = scanner.next().charAt(0);
        
        if (attendancePercentage >= 75 || medicalCause == 'Y' || medicalCause == 'y') {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam.");
        }
        
        scanner.close();
    }
}