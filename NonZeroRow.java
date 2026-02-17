import java.util.Scanner;

public class NonZeroRow{
    
    //method to check if a given row in an array has any non-zero elements
    // if yes return true
    // if no return false
    public static boolean isNonZeroRow(int rowIndex, int[][] array2D){
        for(int i = 0; i < array2D[rowIndex].length; i++){
            if(array2D[rowIndex][i] != 0){
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows in the 2d array: ");
        int numRows = scanner.nextInt();
        
        System.out.println("Enter the number of columns to be in the 2d array: ");
        int numCols = scanner.nextInt();
        
        int[][] array2D = new int[numRows][numCols];
        System.out.println("Enter the elements of the 2d array: ");
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                array2D[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Entter the row index to check: ");
        int row = scanner.nextInt();
        
        //check if the specified row is non-zero:
        boolean result = false;
        if(rowIndex >= 0 && rowIndex < rows){
            result = isNonZeroRow(rowIndex, array2D);
        }else{
            System.out.println("Invalid Row Index");
            scanner.close();
            return;
        }
        
        scanner.close();
    } 
}