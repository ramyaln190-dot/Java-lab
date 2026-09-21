class MultiDimensional {
    public static void main(String args[]) {

        // Declaring and initializing 2D array
        int arr[][] = {
                { 2, 7, 9 },
                { 5, 6, 1 },
                { 7, 4, 2 }
        };

        // Printing 2D array
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
