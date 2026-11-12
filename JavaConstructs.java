public class JavaConstructs {
    public static void main(String[] args) {

        // Variables and data types
        int a = 10, b = 5;
        double price = 25.50;
        char grade = 'A';
        boolean passed = true;

        System.out.println("Java Programming Constructs");
        System.out.println("Integer a = " + a);
        System.out.println("Integer b = " + b);
        System.out.println("Price = " + price);
        System.out.println("Grade = " + grade);
        System.out.println("Passed = " + passed);

        // Operators
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));

        // Conditional statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than or equal to a");
        }

        // Switch statement
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Invalid choice");
        }

        // For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While loop
        System.out.println("While loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
    }
}