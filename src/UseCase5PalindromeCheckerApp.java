import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using both Queue and Stack data structures.
 *
 * The program demonstrates FIFO (Queue) and
 * LIFO (Stack) behaviors.
 *
 * Flow:
 * - Characters are inserted into a Queue (Enqueue)
 * - Characters are pushed into a Stack
 * - Characters are removed from Queue (Dequeue)
 *   and Stack (Pop) and compared
 *
 * If all characters match, the string is a palindrome.
 *
 * Key Concepts:
 * - Queue (FIFO)
 * - Stack (LIFO)
 * - Enqueue, Dequeue, Push, Pop operations
 * - Logical comparison using data structures
 *
 * Data Structures Used:
 * - Queue
 * - Stack
 *
 * @author Chaitanya Bhargav
 * @version 6.0
 */
public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string to check
        String str = "racecar";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into Queue and Stack
        for (char c : str.toCharArray()) {
            queue.add(c);   // Enqueue operation
            stack.push(c);  // Push operation
        }

        boolean isPalindrome = true;

        // Compare dequeue from Queue and pop from Stack
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack.pop();    // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}