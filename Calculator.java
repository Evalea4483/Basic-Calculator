import java.util.Scanner;

// creating new class Calculator() 
public class Calculator {
    // setting up the main method
    public static void main(String[] args) {
        //creating scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //setting up variables
        double num1, num2, result;
        char operator;


        System.out.println("Simple Calculator");

        //setting up user input 
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();


        // setting up the the different cases and their results. for num1 (+,-,*,/) num2
        switch(operator) {
            case '+':
                result = num1 + num2; 
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*': 
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            //for the division case, we have an if statement saying that so long as num2 is not equal to 0, then it will
            //print the result -- if it were 0, it will print an error
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid Operator");
                    
        }

        scanner.close();






    }
    
}
