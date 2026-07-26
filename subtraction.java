// Import java.util

import java.util.Scanner;

public class subtraction {
    
    // Main method

    public static void main(String[] args) {

        // Create scanner object

        Scanner scanner = new Scanner(System.in);

        // First number

        System.out.println("Enter first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());

        // Second number

        System.out.println("Enter second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        // Result
        
        int result = num1 - num2;
        System.out.println("Result: " + result);

    }
}
