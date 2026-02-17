import java.util.Scanner;

public class NumNonZeroRows {

    public static int NumNonZeroRow(int[][] array2D) {
        int count = 0;
        for (int i = 0; i < array2D.length; i++) {
            boolean isNonZeroRow = true;
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == 0) {
                    isNonZeroRow = false;
                    break;
                }
            }
            if (isNonZeroRow) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows in the 2d array: ");
        int numRows = scanner.nextInt();

        System.out.println(
            "Enter the number of columns to be in the 2d array: "
        );
        int numCols = scanner.nextInt();

        int[][] array2D = new int[numRows][numCols];
        System.out.println("Enter the elements of the 2d array: ");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                array2D[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Entter the row index to check: ");
        int row = scanner.nextInt();

        int result = NumNonZeroRow(array2D);

        System.out.println("The number of non-zero rows are: " + result);

        scanner.close();
    }
}
