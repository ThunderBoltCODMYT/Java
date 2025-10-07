public class acp5 {
    public static void main(String args[]) {
        int n = 10;
        
        printFibonacciSeries(n);
    }
    
    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }
        
        long firstTerm = 0;
        long secondTerm = 1;
        
        System.out.println("Fibonacci Series for first " + n + " terms:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm);
            if (i < n) {
                System.out.print(", ");
            }
            
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}
