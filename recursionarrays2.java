import java.util.*;
public class recursionarrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to find indices: ");
        int x = scanner.nextInt();
        AllIndexes(arr, n, x);
        scanner.close();
    }

    public static int AllIndexesRecursive(int[] input, int size, int x, int[] output){
        if(size == 0){return 0;};
        int smallAns = AllIndexesRecursive(input, size - 1, x, output);

        if(input[size - 1] == x){
            output[smallAns++] = size - 1;
        }

        return smallAns;
    }

    static void AllIndexes(int[] input, int n, int x){
        int[] output = new int[n];
        int size = AllIndexesRecursive(input, n, x, output);
        for(int i = 0; i < size; i++){
            System.out.println(output[i] + " ");
        }
    }
}