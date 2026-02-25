/**
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts the string to a char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the validation result
 *
 * This approach reduces extra memory usage.
 *
 * Key Concepts:
 * - Class, Main Method, Char Array, Loops, Two-Pointer Technique, Conditional Statement
 *
 * @author Developer
 * @version 4.0
 */
public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // String to validate
        String str = "level";

        // Convert string to char array
        char[] chars = str.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}