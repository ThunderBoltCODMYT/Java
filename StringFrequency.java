package Javacourse;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StringFrequency {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        final int[] freq = new int[str.length()];

        char[] str1 = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;

            for (int j = 0; j < str.length(); j++) {
                if (str1[i] == str1[j]) {
                    freq[i]++;

                    str1[j] = '0';
                }
            }
        }

        System.out.println("Frequencies of the characters in the string are as below: ");
        System.out.println("Character frequencies");
        for (int i = 0; i < freq.length; i++) {
            if (' ' != str1[i] && '0' != str1[i]) {
                System.out.println(str1[i] + " " + freq[i]);
            }
        }
    }
}