// File: UseCase9PalindromeCheckerApp.java
// UC9: Recursive Palindrome Checker
// Goal: Check palindrome using recursion

import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start crosses end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If mismatch found, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call with next inner indices
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check for palindrome:");
        String input = scanner.nextLine();

        // Call recursive function
        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}