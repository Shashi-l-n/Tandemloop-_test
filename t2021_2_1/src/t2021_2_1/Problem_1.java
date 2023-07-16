package t2021_2_1;

import java.util.Scanner;

public class Problem_1 {
	private double a;
    private double b;

    public Problem_1(double a, double b) {
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
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
    	Scanner scn =new Scanner(System.in);
    	System.out.println("Enter the values for A and B");
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        System.out.println("Enter the your choice of addition press 1");
        System.out.println("Enter the your choice for subtraction press 2");  
        System.out.println("Enter the your choice for multiplication press 3");
        System.out.println("Enter the your choice for division press 4");


        String operation = scn.next();

        Problem_1 calculator = new Problem_1(a, b);

        switch (operation) {
            case "1":
                System.out.println("Result: " + calculator.add());
                break;
            case "2":
                System.out.println("Result: " + calculator.subtract());
                break;
            case "3":
                System.out.println("Result: " + calculator.multiply());
                break;
            case "4":
                System.out.println("Result: " + calculator.divide());
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

	
	
}


