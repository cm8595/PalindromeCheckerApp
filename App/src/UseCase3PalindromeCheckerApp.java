/**
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares the original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * Key Concepts:
 * - Class, Main Method, String Manipulation, Loops, Conditional Statement
 *
 * @author Chaitanya Bhargav
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Original string to check
        String str = "racecar";

        // Build reversed string manually
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check palindrome
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}