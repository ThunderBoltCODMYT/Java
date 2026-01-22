import java.util.*;
public class MergeSort{
    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = arr[l + i];
        }

        for(int i = 0; i < n2; i++){
            R[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0;
        int k = l;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r){
        if(l < r){
            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void printArray(int[] numbers){
        for(int number : numbers){
            System.out.println(number);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        sort(numbers, 0, numbers.length - 1);

        System.out.println("sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.println(numbers[i]);
        }
        scanner.close();
    }
}