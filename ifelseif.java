class ifelseif {
    public static void main(String[] args) {
        int income = 30000;
        if (income > 1000000) {
            System.out.println("he is rich");
        } else if (income < 1000000 && income > 50000) {
            System.out.println("he is middle class");
        } else {
            System.out.println("he is poor");
        }

    }
}
