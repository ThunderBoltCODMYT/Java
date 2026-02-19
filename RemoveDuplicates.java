import java.util.Scanner;
public class RemoveDuplicates {
    // Method to remove duplicates from an array and return a new array without duplicates
    public int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int[] result = new int[arr.length];
        int index = 0;
        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            // Check if the element is already in the result array
            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }
            // If not a duplicate, add to result
            if (!duplicate) {
                result[index] = arr[i];
                index++;
            }
        }
        // Trim the result array to the actual number of unique elements
        int[] trimmedResult = new int[index];
        for (int i = 0; i < index; i++) {
            trimmedResult[i] = result[i];
        }
        return trimmedResult;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Ask the user for the number of elements
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();

            // Read the elements
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Remove duplicates
            RemoveDuplicates obj = new RemoveDuplicates();
            int[] unique = obj.removeDuplicates(arr);

            // Print the array after removing duplicates
            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < unique.length; i++) {
                System.out.print(unique[i]);
            }
            System.out.println();
        }
    }
}