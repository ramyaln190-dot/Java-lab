public class FactorialProgram {
    public static void main(String[] args) {
        // Hardcoded input value
        int number = 5;

        // Initialize variables
        long factorial = 1;
        int i = 1;

        // Check if the number is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using a while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
