public class MethodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        System.out.println("Sum of two integers: " + obj.add(10, 20));
        System.out.println("Sum of three integers: " + obj.add(10, 20, 30));
        System.out.println("Sum of two decimal numbers: " + obj.add(5.5, 4.5));
    }
}
