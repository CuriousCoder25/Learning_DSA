
class Calculator {
    public sum(double a, double b){
        return a + b;
    }
    public difference(double a, double b){
        return a - b;
    }
    public product(double a, double b){
        return a * b;
    }
    public quiotent(double a, double b){
        return a / b;
    }
    public remainder(double a, double b){
        return a % b;
    public power(double a, double b){
        return Math.pow(a,b);
    }
    }


}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! This flicky you math friend!");
        System.out.println("\n");
        double num1 = input.nextDouble();
        char operator = input.nextChar();
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
