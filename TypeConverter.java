public class TypeConverter {
    public static void main(String[] args) {

        int a = 10;

        // int to double
        double b = a;

        // double to int
        double x = 20.5;
        int y = (int) x;

        System.out.println("Integer: " + a);
        System.out.println("Integer to Double: " + b);
        System.out.println("Double: " + x);
        System.out.println("Double to Integer: " + y);
    }
}