import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListSorting {
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> numbersList = new ArrayList<>();

        // Fill it with random integers between 0 and 99
        Random rand = new Random();
        for (int i = 0; i < 10; i++) { // fixed bound for how many numbers
            numbersList.add(rand.nextInt(100));
        }

        // Print the unsorted list
        System.out.println("Unsorted list: " + numbersList);

        // Selection sort on ArrayList
        for (int i = 0; i < numbersList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbersList.size(); j++) {
                if (numbersList.get(j) < numbersList.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap using set()
            int temp = numbersList.get(minIndex);
            numbersList.set(minIndex, numbersList.get(i));
            numbersList.set(i, temp);
        }

        // Print the sorted list
        System.out.println("Sorted list: " + numbersList);
    }
}