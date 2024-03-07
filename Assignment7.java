/*7. The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.*/


public class GirlsGradeCalculator {
    public static void main(String[] args) {
     
        int totalStudents = 90;
        int boys = 45;
        double percentageGradeA = 50.0;
        int boysGradeA = 20;
        int totalGradeA = (int) (totalStudents * (percentageGradeA / 100));
        int girlsGradeA = totalGradeA - boysGradeA;

        System.out.println("Total number of girls getting grade A: " + girlsGradeA);
    }
}

