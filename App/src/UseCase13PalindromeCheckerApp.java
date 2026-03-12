// File: UseCase13PalindromeCheckerApp.java
// Palindrome Checker App - UC13: Performance Comparison
// Author: Bhargav
// Date: 2026-03-12
// Goal: Compare the performance of different palindrome checking approaches

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Approach 1: Iterative with char array
    public static boolean iterativeCheck(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }

    // Approach 2: Stack-based
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Approach 3: Deque-based
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Measure execution time for a method
    public static long measureTime(Runnable algorithm) {
        long start = System.nanoTime();
        algorithm.run();
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome performance:");
        String input = scanner.nextLine();

        // Measure iterative approach
        long timeIterative = measureTime(() -> iterativeCheck(input));

        // Measure stack approach
        long timeStack = measureTime(() -> stackCheck(input));

        // Measure deque approach
        long timeDeque = measureTime(() -> dequeCheck(input));

        System.out.println("\nPerformance Results (in nanoseconds):");
        System.out.println("Iterative check: " + timeIterative);
        System.out.println("Stack check:     " + timeStack);
        System.out.println("Deque check:     " + timeDeque);

        scanner.close();
    }
}