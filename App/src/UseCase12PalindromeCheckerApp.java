// File: UseCase12PalindromeCheckerApp.java
// Palindrome Checker App - UC12: Strategy Pattern for Palindrome Algorithms
// Author: Bhargav
// Date: 2026-03-12
// Goal: Choose a palindrome checking algorithm dynamically at runtime
// Objective: Demonstrate Strategy Pattern using different palindrome algorithms

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context class that uses a strategy
class PalindromeCheckerContext {
    private PalindromeStrategy strategy;

    // Constructor injects the strategy
    public PalindromeCheckerContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    // Setter to change strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    // Method that uses the strategy
    public boolean checkPalindrome(String input) {
        return strategy.isPalindrome(input);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check for palindrome (Strategy Pattern):");
        String input = scanner.nextLine();

        // Let user select strategy
        System.out.println("Choose strategy: 1 - Stack, 2 - Deque");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        PalindromeStrategy strategy;
        switch (choice) {
            case 1:
                strategy = new StackStrategy();
                break;
            case 2:
                strategy = new DequeStrategy();
                break;
            default:
                System.out.println("Invalid choice, defaulting to Stack strategy.");
                strategy = new StackStrategy();
        }

        // Create context and check palindrome
        PalindromeCheckerContext checker = new PalindromeCheckerContext(strategy);
        if (checker.checkPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}