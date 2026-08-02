import java.util.Scanner;

class Calculator {
    double sum(double a, double b) { return a + b; }
    double difference(double a, double b) { return a - b; }
    double product(double a, double b) { return a * b; }
    double quiotent(double a, double b) { return a / b; }
    double remainder(double a, double b) { return a % b; }    
    double power(double a, double b) { return Math.pow(a, b); }
}

public class Foundations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Calculator calc = new Calculator();
        System.out.println("Hello, World! This flicky you math friend!");
        
        while (true) {
            System.out.println("Press Enter to continue, or type 'esc' to quit:");
            String exit_input = input.nextLine(); 
            
            if (exit_input.equalsIgnoreCase("esc")) {
                System.out.println("Exiting program...");
                break; 
            }
            
            System.out.print("Enter equation WITH spaces (e.g., 1 + 2): ");
            double num1 = input.nextDouble();
            char operator = input.next().charAt(0);
            double num2 = input.nextDouble();
            
            // This clears the remaining Enter key ('\n') out of the buffer
            input.nextLine(); 
            
            double result = 0;
            switch (operator) {
                case '+' : result = calc.sum(num1, num2); break;
                case '-' : result = calc.difference(num1, num2); break;
                case '*' : result = calc.product(num1, num2); break;
                case '/' : result = calc.quiotent(num1, num2); break;
                case '%' : result = calc.remainder(num1, num2); break;
                case '^' : result = calc.power(num1, num2); break;
                default : System.out.println("Wrong Operator X \n"); break;
            }
            System.out.println("= " + result + "\n");
        }    
        input.close();
    }
}
