import java.util.Arrays;
import java.util.Scanner;

public class FindEvenNumbers {
    
    public static int[] findEvenNumbers(int[] numbers){
        int[] evenNumbers = new int[numbers.length];
        int index = 0;
        for(int number : numbers){
            if(number % 2 == 0){
                evenNumbers[index++] = number;
            }
        }
        return Arrays.copyOf(evenNumbers, index);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }
        int[] evenNumbers = findEvenNumbers(numbers);
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        scanner.close();
    }
}