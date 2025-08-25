package multiplication;
import java.util.Scanner;

class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        return a / b;
    }
}

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation: ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b);

        double result;
        switch (operation.toLowerCase()) {
            case "add":
                result = calc.add();
                break;
            case "sub":
                result = calc.subtract();
                break;
            case "mul":
                result = calc.multiply();
                break;
            case "div":
                result = calc.divide();
                break;
            default:
                System.out.println("Invalid operation!");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
