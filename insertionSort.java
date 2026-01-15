import java.util.Arrays;
import java.util.Random;
/*
INSERTION SORT: 
*/
public class insertionSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100_000);
        }
        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("After: ");
        InsertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void InsertionSort(int inputArray[]){
        for(int i = 1; i < inputArray.length; i++){
            int currentValue = inputArray[i];
            int j = i - 1;
            while(j >= 0 && inputArray[j] > currentValue){
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }
}