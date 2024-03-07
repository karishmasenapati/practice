/*8. A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.*/
public class Prg8 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500 are:");

        for (int number = 100; number <= 500; number++) {
            int originalNumber = number;
            int result = 0;

            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                result += Math.pow(digit, 3);
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.println(number);
            }
        }
    }
}