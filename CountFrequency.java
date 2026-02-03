package Javacourse;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class CountFrequency {
    public static void main(final String[] args) {

// Create a Scanner object to read input from the user

        final Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

// Prompt the user for the first string

        System.out.print("Enter the first string: ");

        final String s1 = sc.nextLine();

        System.out.println("For " + s1);

        CountFrequency.frequency(s1);

// Prompt the user for the second string

        System.out.print("Enter the second string: ");

        final String s2 = sc.nextLine();

        System.out.println("For " + s2);

        CountFrequency.frequency(s2);

    }

// Method to calculate and print the frequency of characters in a given string

    private static void frequency(final String s) {

// Check if the string is empty

        if (0 == s.length()) {

            System.out.println("Empty string");

            return;

        }

// Create an ArrayList to store occurrences of characters

        final ArrayList<CharOccur> occurrences = new ArrayList<CharOccur>();

        // Loop through each character in the string

        for (int i = 0; i < s.length(); i++) {

// Get the character at position i

            final char c = s.charAt(i);

            int flag = 0;

// Check if the character is already present in the occurrences list

            for (final CharOccur o : occurrences) {

                if (o.character == c) {

                    o.occurrence += 1; // Increment occurrence if character already exists

                    flag = 1;

                }

            }

// If the character was not found, create a new CharOccur object for it

            if (0 == flag) {

                final CharOccur grp = new CharOccur(c, 1);

                occurrences.add(grp);

            }

        }

// Print the frequency of each character

        for (final CharOccur o : occurrences) {

            System.out.println(o.character + " " + o.occurrence);

        }

    }

}

// Class to store each character and its occurrence count

class CharOccur {

// Character and its occurrence

    char character;

    int occurrence;

// Constructor to initialize character and occurrence

    CharOccur(final char character, final int occurrence) {

        this.character = character;

        this.occurrence = occurrence;

    }

}