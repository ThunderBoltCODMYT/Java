public class GetRowWithMaxSum {

    public static int getRowWithMaxSum(int[][] array2D) {
        int maxRow = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array2D.length; i++) {
            int sum = 0;
            for (int j = 0; j < array2D[i].length; j++) {
                sum += array2D[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

    // Ask the user to input the number of rows and columns

    System.out.print("Enter the number of rows in the array: ");

    int rows = sc.nextInt();

    System.out.print("Enter the number of columns in the array: ");

    int cols = sc.nextInt();

    // Create a 2D array based on user input

    int[][] array2D = new int[rows][cols];

    // Read the elements of the 2D array

    System.out.println("Enter the elements of the 2D array:");

    for (int i = 0; i < rows; i++) {

    for (int j = 0; j < cols; j++) {

    array2D[i][j] = sc.nextInt();

    }

    }

    // Get the row with the maximum sum

    int result = getRowWithMaxSum(array2D);

    // Print the row index and its sum

    int maxSum = 0;

    for (int j = 0; j < array2D[result].length; j++) {

    maxSum += array2D[result][j];

    }

    System.out.println("The row with the maximum sum is: " + result);

    System.out.println("Sum of that row: " + maxSum);

    }

    }

    }
}
