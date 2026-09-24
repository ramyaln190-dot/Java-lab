import java.util.Scanner;

public class AreaPerimeter {

    // Method to find area of square
    static double squareArea(double side) {
        return side * side;
    }

    // Method to find perimeter of square
    static double squarePerimeter(double side) {
        return 4 * side;
    }

    // Method to find area of rectangle
    static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Method to find perimeter of rectangle
    static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Method to find area of triangle
    static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to find perimeter of triangle
    static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Method to find area of circle
    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to find perimeter of circle
    static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        System.out.println("Square Area = " + squareArea(side));
        System.out.println("Square Perimeter = " + squarePerimeter(side));

        // Rectangle
        System.out.print("\nEnter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        System.out.println("Rectangle Area = " + rectangleArea(length, width));
        System.out.println("Rectangle Perimeter = " +
                rectanglePerimeter(length, width));

        // Triangle
        System.out.print("\nEnter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        System.out.print("Enter side 1 of triangle: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2 of triangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3 of triangle: ");
        double c = sc.nextDouble();

        System.out.println("Triangle Area = " + triangleArea(base, height));
        System.out.println("Triangle Perimeter = " +
                trianglePerimeter(a, b, c));

        // Circle
        System.out.print("\nEnter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.println("Circle Area = " + circleArea(radius));
        System.out.println("Circle Perimeter = " + circlePerimeter(radius));

        sc.close();
    }
}
