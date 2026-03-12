// File: UseCase8PalindromeCheckerApp.java
// UC8: Linked List Based Palindrome Checker
// Goal: Check palindrome using singly linked list

import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListPalindrome {
    Node head;

    // Convert string to linked list
    public void stringToLinkedList(String str) {
        head = null;
        Node tail = null;
        for (char c : str.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    // Check if linked list is palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Find middle using slow and fast pointers
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverseList(slow.next);

        // Compare halves
        Node firstHalf = head;
        Node secondHalfCopy = secondHalf; // Keep copy to restore list if needed
        boolean palindrome = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Optional: Restore the original list
        slow.next = reverseList(secondHalfCopy);

        return palindrome;
    }

    // Reverse a linked list
    private Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListPalindrome llp = new LinkedListPalindrome();

        System.out.println("Enter a string to check for palindrome:");
        String input = scanner.nextLine();

        llp.stringToLinkedList(input);

        if (llp.isPalindrome()) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}