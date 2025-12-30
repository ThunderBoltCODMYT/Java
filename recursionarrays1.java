import java.util.*;
public class recursionarrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        displayArr(arr, 0);
    }

    public static void displayArr(int[] array, int index) {
        if (index == array.length) return;
        System.out.println(array[index]);
        displayArr(array, index + 1);
    }
}