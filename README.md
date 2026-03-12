# Palindrome Checker App - UC12: Strategy Pattern for Palindrome Algorithms

## Author
Bhargav

## Date
2026-03-12

## Objective
The objective of the PalindromeChecker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

## Goal
Choose a palindrome checking algorithm dynamically at runtime using **Strategy Pattern**.

## Flow
1. Define a `PalindromeStrategy` interface.
2. Implement multiple strategies:
   - `StackStrategy` – Uses a stack to check palindrome.
   - `DequeStrategy` – Uses a deque to check palindrome.
3. Create a `PalindromeCheckerContext` that accepts a strategy.
4. Inject and use the chosen strategy at runtime.

## Key Concepts Used
- **Interface** – Defines the strategy contract.
- **Polymorphism** – Allows using different strategies interchangeably.
- **Strategy Pattern** – Encapsulates algorithms and enables dynamic switching.
- **Data Structure** – Varies per strategy (Stack / Deque).

## Compilation and Execution

### Compile
```bash
javac UseCase12PalindromeCheckerApp.java