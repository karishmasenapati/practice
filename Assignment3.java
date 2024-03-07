/*3. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/


public class MathOperation {
    public static void main(String[] args) {
      
        int number = 2345;
        int add = number + 8;
        double divide = (double) add / 3;
        int module = (int) divide % 5;
        int result = module * 5;

     
        System.out.println("Initial number: " + number);
        System.out.println("After adding 8: " + add);
        System.out.println("After dividing by 3: " +divide);
        System.out.println("Modulus with 5: " + module);
        System.out.println("After multiplying by 5: " + result);
    }
}
