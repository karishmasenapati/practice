/*3. Print the multiplication table of 15 using recursion.*/

public class Problem3 {
    public static void main(String[] args) {
        int number = 15;
        printMultiplicationTable(number, 1);
    }

    private static void printMultiplicationTable(int number, int multiplier) {
        if (multiplier > 10) {
            return;
        }

        int product = number * multiplier;
        System.out.println(number + " * " + multiplier + " = " + product);
        printMultiplicationTable(number, multiplier + 1);
    }
}

