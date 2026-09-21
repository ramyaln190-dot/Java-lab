public class ReverseNumber {
    public static void main(String[] args) {
        int number = 7584;
        int originalNumber = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }

        System.out.println("The reverse of " + originalNumber + " is: " + reverse);
    }
}
