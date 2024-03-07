/*5. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
A - first program by using a third variable
B - second program without using any third variable*/

import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of 'b': ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping without using third variable:");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        int x=10;
        int y=20;
        
        int temp = x;
        x = y;
        y = temp;

   
        System.out.println("After swapping using third variable:");
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }
}
