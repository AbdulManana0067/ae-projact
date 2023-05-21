import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        char operator;
        double number1, number2, result;

        // Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Ask users to enter the operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // Ask users to enter the numbers
        System.out.println("Enter the first number");
        number1 = input.nextDouble();

        System.out.println("Enter the second number");
        number2 = input.nextDouble();

        switch (operator) {

            // Perform addition between the numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // Perform subtraction between the numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // Perform multiplication between the numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // Perform division between the numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
