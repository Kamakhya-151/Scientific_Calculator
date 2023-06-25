import java.util.Scanner;

public class Scientific_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Scientific Calculator");
        System.out.println("---------------------");
        
        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Trigonometric Functions");
            System.out.println("6. Logarithm");
            System.out.println("7. Exit");
            
            int choice = scanner.nextInt();
            
            if (choice == 7) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            
            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    performTrigonometricFunctions();
                    break;
                case 6:
                    performLogarithm();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            System.out.println();
        }
    }
    
    public static void performAddition() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Addition");
        System.out.println("--------");
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = num1 + num2;
        
        System.out.println("Result: " + result);
    }
    
    public static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Subtraction");
        System.out.println("-----------");
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = num1 - num2;
        
        System.out.println("Result: " + result);
    }
    
    public static void performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Multiplication");
        System.out.println("--------------");
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = num1 * num2;
        
        System.out.println("Result: " + result);
    }
    
    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Division");
        System.out.println("--------");
        
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();
        
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        }
    }
    
    public static void performTrigonometricFunctions() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Trigonometric Functions");
        System.out.println("-----------------------");
        
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        
        double radians = Math.toRadians(angle);
        
        System.out.println("Sin(" + angle + ") = " + Math.sin(radians));
        System.out.println("Cos(" + angle + ") = " + Math.cos(radians));
        System.out.println("Tan(" + angle + ") = " + Math.tan(radians));
    }
    
    public static void performLogarithm() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Logarithm");
        System.out.println("---------");
        
        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();
        
        if (number <= 0) {
            System.out.println("Error: Invalid input. Logarithm is defined for positive numbers only.");
        } else {
            System.out.println("Log(" + number + ") = " + Math.log10(number));
        }
    }
}
