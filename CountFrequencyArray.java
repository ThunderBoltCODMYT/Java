
import java.util.Scanner;

public class CountFrequencyArray {

    private static void CountFrequencyOfCharArray(char[] str1, char[] str2, int[] result) {
        int[] frequencies = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    frequencies[i]++;
                }
            }
        }

        for (int i = 0; i < frequencies.length; i++) {
            result[i] = frequencies[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.println();

        if (n <= 0) {
            System.out.println("Array size should be greater than 0");
            return;
        }

        char[] charArray1 = new char[n];
        char[] charArray2 = new char[n];

        System.out.println("Enter the first string of " + n + " size: ");
        String str1 = scanner.nextLine();

        System.out.println();

        System.out.println("Enter the second string of " + n + " size: ");
        String str2 = scanner.nextLine();

        if (str1.length() > n) {
            str1 = str1.substring(0, n);
        }

        if (str2.length() > n) {
            str2 = str2.substring(0, n);
        }

        charArray1 = str1.toCharArray();
        charArray2 = str2.toCharArray();
        int[] result = new int[n];

        CountFrequencyOfCharArray(charArray1, charArray2, result);

        System.out.println("The frequencies of the characters are as follows: ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        scanner.close();
    }

}
