import java.util.Scanner;

public class acp7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************MATRIX PROGRAM*************************");
        System.out.println("NOTE: Addition , Subtraction are only possible when the Matrices dimensions are the same.");

        System.out.println("What do you want the size of the matrices to be in rows?: ");
        int rows = scanner.nextInt();
        System.out.println("What do you want the size of the matrices to be in columns?: ");
        int columns = scanner.nextInt();

        if (rows <= 1 || columns <= 1) {
            throw new ArithmeticException("Matrices must have at least 2 rows and columns.");
        }

        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];

        System.out.println("Please enter the elements of the first matrix row by row: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Please enter the elements of the second matrix row by row: ");
        for (int x = 0; x < rows; x++) {
            for (int z = 0; z < columns; z++) {
                matrix2[x][z] = scanner.nextInt();
            }
        }

        int operation;
        do {
            System.out.println("\nWhich operation do you want to apply? (enter number)");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Matrix Multiplication");
            System.out.println("4. Exit");
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    int[][] sum = addMatrices(matrix1, matrix2, rows, columns);
                    System.out.println("Result of Addition:");
                    printMatrix(sum, rows, columns);
                    break;
                    
                case 2:
                    int[][] diff = subtractMatrices(matrix1, matrix2, rows, columns);
                    System.out.println("Result of Subtraction:");
                    printMatrix(diff, rows, columns);
                    break;

                case 3:
                    System.out.print("Enter rows for Matrix A: ");
                    int rowsA = scanner.nextInt();
                    System.out.print("Enter cols for Matrix A: ");
                    int colsA = scanner.nextInt();

                    System.out.print("Enter rows for Matrix B: ");
                    int rowsB = scanner.nextInt();
                    System.out.print("Enter cols for Matrix B: ");
                    int colsB = scanner.nextInt();

                    if (colsA != rowsB) {
                        throw new ArithmeticException(
                                "Multiplication not possible! Columns of A must equal rows of B.");
                    }

                    int[][] matrixA = new int[rowsA][colsA];
                    int[][] matrixB = new int[rowsB][colsB];

                    System.out.println("Enter elements of Matrix A:");
                    for (int i = 0; i < rowsA; i++) {
                        for (int j = 0; j < colsA; j++) {
                            matrixA[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Enter elements of Matrix B:");
                    for (int i = 0; i < rowsB; i++) {
                        for (int j = 0; j < colsB; j++) {
                            matrixB[i][j] = scanner.nextInt();
                        }
                    }

                    int[][] product = multiplyMatrices(matrixA, matrixB, rowsA, colsA, colsB);
                    System.out.println("Result of Multiplication:");
                    printMatrix(product, product.length, product[0].length);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (operation != 4);

        scanner.close();
    }

    private static int[][] addMatrices(int[][] A, int[][] B, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int x = 0; x < rows; x++) {
            for (int z = 0; z < cols; z++) {
                result[x][z] = A[x][z] + B[x][z];
            }
        }
        return result;
    }

    private static int[][] subtractMatrices(int[][] A, int[][] B, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int x = 0; x < rows; x++) {
            for (int z = 0; z < cols; z++) {
                result[x][z] = A[x][z] - B[x][z];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] A, int[][] B, int rowsA, int colsA, int colsB) {
        int[][] result = new int[rowsA][colsB];
        for (int x = 0; x < rowsA; x++) {
            for (int z = 0; z < colsB; z++) {
                result[x][z] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[x][z] += A[x][k] * B[k][z];
                }
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int x = 0; x < rows; x++) {
            for (int z = 0; z < cols; z++) {
                System.out.print(matrix[x][z] + " ");
            }
            System.out.println();
        }
    }
}