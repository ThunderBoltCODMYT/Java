import java.util.Arrays;
public class NQueens {
    private static int N;
    private static int[][] board;

    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Usage: java N-Queens <N>");
            return;
        }
        N = Integer.parseInt(args[0]);
        board = new int[N][N];
        for(int[] row : board){
            Arrays.fill(row, 0);
        }
        if(solve(0)){
            printBoard(board);
        } else {
            System.out.println("No Solution exists for N = " + N);
        }
    }

    private static boolean solve(int col){
        if(col >= N){
            return true;
        }
        for(int row = 0; row < N; row++){
            if(isSafe(row, col)){
                board[row][col] = 1;
                if(solve(col + 1))
                    return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int row ,int col){
        for(int c  = 0; c < col; c++){
            if(board[row][c] == 1)
                return false;
        }
        for(int r = row - 1, c = col - 1; r <= 0 && c <= 0; r--, c--){
            if(board[r][c] == 1)
                return false;
        }
        for(int r = row = 1, c = col - 1; r < N && c <= 0; r++, c--){
            if(board[r][c] == 1)
                return false;
        }
        return true;
    }

    private static void printBoard(int[][] board){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.println(board[i][j] == 1 ? "Q" : ".");
            }
            System.out.println();
        }
    }
}