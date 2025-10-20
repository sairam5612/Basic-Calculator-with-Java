# Java Console Calculator (Elevate Labs Internship - Task 1)

## 🎯 Objective
This project is a basic console calculator built using Java. It fulfills **Task 1: Java Console Calculator** for the Elevate Labs Java Developer Internship.

The application is designed to demonstrate understanding of Java console I/O, methods, loops, and conditional logic.

## ✨ Key Concepts Used
- **Methods:** Separate methods were created for addition, subtraction, multiplication, and division.
- **I/O:** The `java.util.Scanner` class was used to handle console input.
- **Loops:** A continuous `while` loop allows for multiple calculations until the user chooses to exit.
- **Error Handling:** Implemented `try-catch` blocks to handle runtime exceptions (like invalid input) and includes explicit checks to prevent division by zero.

## 💻 Features
- **Operations:** Supports standard arithmetic operations: `+`, `-`, `*`, `/`.
- **Continuous Flow:** Allows the user to perform subsequent calculations by entering 'Yes' or stop by entering 'Exit'.
- **Validation:** Handles non-numeric input and prevents division by zero.
- **Data Types:** Uses the `long` data type for numeric inputs and calculations.

## 🚀 How to Run the Application

1.  **Prerequisites:** Ensure you have the **Java Development Kit (JDK)** installed.
2.  **Compilation:** Navigate to the directory containing the `com` folder and compile the code:
    ```bash
    javac com/CalculatorApp/CalApp.java
    ```
3.  **Execution:** Run the compiled class file from the parent directory:
    ```bash
    java com/CalculatorApp/CalApp
    ```
