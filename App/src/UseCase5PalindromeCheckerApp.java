/**
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 *
 * Use Case 5: Stack Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Stack data structure.
 *
 * At this stage, the application:
 * - Pushes each character of the string into a stack
 * - Pops characters from the stack to reverse the order
 * - Compares the reversed string with the original string
 * - Displays the validation result
 *
 * This demonstrates the use of stack-based reversal logic.
 *
 * Key Concepts:
 * - Stack Data Structure, LIFO Principle, Push Operation, Pop Operation,
 *   String Manipulation, Conditional Statement
 *
 * @author Chaitanya Bhargav
 * @version 5.0
 */

import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string to check
        String str = "racecar";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Build reversed string using pop
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Check palindrome
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}