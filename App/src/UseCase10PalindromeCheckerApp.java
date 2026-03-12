// File: UseCase10PalindromeCheckerApp.java
// Palindrome Checker App - UC10: Case-Insensitive & Space-Ignored Palindrome
// Author: Bhargav (example author, replace as needed)
// Date: 2026-03-12
// Goal: Ignore spaces and case while checking a palindrome
// Objective: Validate whether a given string is a palindrome while ignoring spaces and letter case.

import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Function to check palindrome (case-insensitive, spaces ignored)
    public static boolean isPalindrome(String str) {
        // Normalize string: remove spaces, convert to lowercase
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Check palindrome
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check for palindrome (case-insensitive, spaces ignored):");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}