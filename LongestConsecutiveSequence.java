import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int findLongestConsecutiveSequence(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int maxLength = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int current = num;
                int length = 1;
                while(set.contains(current + 1)){
                    current++;
                    length++;
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
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
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int maxLength = longestConsecutiveSequence.findLongestConsecutiveSequence(arr);
        System.out.println("The longest consecutive sequence is of length: " + maxLength);
        scanner.close();
    }
}
