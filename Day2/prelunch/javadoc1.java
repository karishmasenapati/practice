/**
 * This is a simple JavaDoc example for a class.
 * It demonstrates the basic structure of JavaDoc comments.
 */
public class Main {

    /**
     * This is a constructor for MyClass.
     * It takes no parameters.
     */
    public Main() {
        // Constructor logic here
    }

    /**
     * This method performs a simple addition operation.
     *
     * @param a The first operand.
     * @param b The second operand.
     * @return The result of the addition operation.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * This method prints a message to the console.
     *
     * @param message The message to be printed.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * This is the main method of the program.
     * It serves as the entry point when the program is executed.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Main myObject = new Main();
        int result = myObject.add(5, 10);
        myObject.printMessage("The result is: " + result);
    }
}
