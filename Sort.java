import java.util.Scanner;

public class Sort {
    public static void swap(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = 0; j <= high - 1; j++){
            if(arr[j] > pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void quickSort(int[] arr, int low, int high){
        
        if(low < high){
            int pi = partition(arr, low, high);
            
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }

    };

    public static void printArr(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array(randomly shuffled): ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted Array: ");
        printArr(arr);
        scanner.close();
    }
}