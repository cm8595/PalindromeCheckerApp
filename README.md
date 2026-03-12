# UseCase6: Queue + Stack Based Palindrome Checker

## Overview

This project demonstrates how **Queue (FIFO)** and **Stack (LIFO)** data structures can be used together to check whether a given string is a **palindrome**.

A **palindrome** is a word or phrase that reads the same **forward and backward**.

Example:

* racecar
* madam
* level

The program inserts characters of a string into both a **Queue** and a **Stack**, then compares their outputs to determine if the string is a palindrome.

---

## Key Concepts

### Queue (FIFO – First In First Out)

A Queue processes elements in the order they are inserted.

Example:

```
Input: r a c e c a r
Output: r a c e c a r
```

Operations used:

* **Enqueue** – Add element to queue
* **Dequeue** – Remove element from queue

---

### Stack (LIFO – Last In First Out)

A Stack processes elements in reverse order of insertion.

Example:

```
Input: r a c e c a r
Output: r a c e c a r (reversed order)
```

Operations used:

* **Push** – Add element to stack
* **Pop** – Remove element from stack

---

## Palindrome Logic

1. Insert each character of the string into:

    * Queue (Enqueue)
    * Stack (Push)

2. Remove characters using:

    * Queue → Dequeue
    * Stack → Pop

3. Compare both characters.

4. If all characters match → the string is a **palindrome**.

---

## Data Structures Used

* Queue
* Stack

Java Classes used:

* `Queue`
* `LinkedList`
* `Stack`

---

## Project Structure

```
UseCase6PalindromeCheckerApp.java
README.md
```

---

## Compilation

Compile the program using:

```
javac UseCase6PalindromeCheckerApp.java
```

---

## Run the Program

Execute the program using:

```
java UseCase6PalindromeCheckerApp
```

---

## Example Output

```
racecar is a palindrome
```

---

## Author

Chaitanya Bhargav

---

## Version

1.0
