import java.util.*;
public class kadane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n  = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i  = 0; i  < n; i++){
            a[i] = scanner.nextInt();
        }
        System.out.println("Maximum contiguous sum is: " + maxSubArraySum(a));
        scanner.close();       
    }
    static int maxSubArraySum(int[] a){
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for(int i = 0; i < size; i++){
                max_so_far = max_ending_here + a[i];

                if(max_so_far < max_ending_here)
                    max_so_far = max_ending_here;

                if(max_ending_here < 0)
                    max_ending_here = 0;
        } 
        return max_so_far;
    }
}