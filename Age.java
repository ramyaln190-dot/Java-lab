import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String topper = "";
        int max = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Enter 5 marks: ");
            int s1 = sc.nextInt();

            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            int s4 = sc.nextInt();
            int s5 = sc.nextInt();

            int total = s1 + s2 + s3 + s4 + s5;
            double avg = total / 5.0;

            System.out.println("Total = " + total);
            System.out.println("Average = " + avg);

            if (total > max) {
                max = total;
                topper = name;
            }
        }

        System.out.println("Topper = " + topper);
        System.out.println("Highest Total = " + max);
    }
}