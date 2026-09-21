public class operatorsdemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("\nAssignment Operator (c += 5): " + c);

        // Unary Operators
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));
        System.out.println("--d = " + (--d));

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Maximum = " + max);
    }
}
