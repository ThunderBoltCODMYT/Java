import java.util.*;
public class recursionarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        displayArrReverse(arr, 0);
    }

    public static void displayArrReverse(int[] array,int index){
        if(index == array.length) return;
        displayArrReverse(array, index + 1);
        System.out.println(array[index]);
    }
}