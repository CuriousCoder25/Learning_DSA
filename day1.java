import java.util.Scanner;
class Calculator {
    double sum(double a, double b) {
        return a + b;
    }
    double difference(double a, double b) {
        return a - b;
    }
    double product(double a, double b) {
        return a * b;
    }
    double quiotent(double a, double b) {
        return a / b;
    }
    double remainder(double a, double b) {
        return a % b;
    }    
    double power(double a, double b) {
        return Math.pow(a,b);
    }
}



public class day1 {
    public static void main(String[] args) {
        System.out.println("Hello, World! This flicky you math friend!");
        System.out.println("\n");
        double num1 = input.nextDouble();
        char operator = input.next().charAt(0);
        double num2 = input.nextDouble();
        
        Calculator calc = new Calculator();
        double result = 0;
        switch (operator) {
            case '+' : result = calc.sum(num1,num2);
            break;
            case '-' : result = calc.difference(num1,num2);
            break;
            case '*' : result = calc.product(num1,num2);
            break;
            case '/' : result = calc.quiotent(num1,num2);
            break;
            case '%' : result = calc.remainder(num1,num2);
            break;
            case '^' : result = calc.power(num1,num2);
            break;
            default : System.out.println("Wrong Operator X \n");
            break;
        }
        System.out.println("\n = \t",result);
    }
}
