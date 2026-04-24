
package com.mycompany.stringutils;



import java.util.*;

public class StringUtils {

    // 1. Find duplicate characters
    public static Set<Character> findDuplicates(String str) {
        Set<Character> duplicates = new HashSet<>();
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                duplicates.add(ch);
            } else {
                seen.add(ch);
            }
        }
        return duplicates;
    }

    // 2. Remove spaces
    public static String removeSpaces(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s+", "");
    }

    // 3. Reverse string
    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    // MENU DRIVEN MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Find Duplicate Characters");
            System.out.println("2. Remove Spaces");
            System.out.println("3. Reverse String");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            switch (choice) {
                case 1 -> System.out.println("Duplicates: " + findDuplicates(input));

                case 2 -> System.out.println("Without spaces: " + removeSpaces(input));

                case 3 -> System.out.println("Reversed: " + reverseString(input));

                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
    }

