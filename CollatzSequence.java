public class CollatzSequence {
    public static void main(String[] args) {
        int number = 21;
        System.out.print("Sequence: " + number);

        while (number != 1) {
            if (number % 2 == 0) {

                number = number / 2;
            } else {

                number = (number * 3) + 1;
            }

            System.out.print(" -> " + number);
        }
        System.out.println("\nFinished! The number reached 1.");
    }
}
