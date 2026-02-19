import java.util.Scanner;

public class Medians {
    public static void findMedian(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            System.out.println("Median: " + ((double) (arr[n / 2 - 1] + arr[n / 2]) / 2));
        } else {
            System.out.println("Median: " + arr[n / 2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        findMedian(arr);
        scanner.close();
    }
}