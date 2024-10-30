import java.util.Scanner;

public class BasicCalculator {

    // Method to perform the selected operation
    public static double calculate(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN; // Return "Not a Number" if division by zero
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return Double.NaN;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two numbers as input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Take the operator as input
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform calculation
        double result = calculate(num1, num2, operator);

        // Display the result
        if (!Double.isNaN(result)) {
            System.out.println("The result is: " + result);
        }
    }
}
