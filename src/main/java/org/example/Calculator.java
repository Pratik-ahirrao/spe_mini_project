package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

//import org.apache.logging.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {
        //BasicConfigurator.configure();

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("Calculator using DevOps. \nChoose operation:");
            System.out.print("1. Factorial function\n2. Square root function\n3. Power function\n4. Natural Logarithm base(e)\n" +
                    "5. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            if(choice == 1){
                System.out.print("Enter a number : ");
                num1 = scanner.nextDouble();
                System.out.println("Factorial of "+num1+" is : " + calculator.calculate_factorial(num1));
                System.out.println("\n");

            } else if (choice == 2) {
                System.out.print("Enter a number : ");
                num1 = scanner.nextDouble();
                System.out.println("Square root of "+num1+" is : " + calculator.calculate_sqroot(num1));
                System.out.println("\n");

            } else if (choice == 3) {
                System.out.print("Enter the first number : ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number : ");
                num2 = scanner.nextDouble();
                System.out.println(num1+ " raised to power "+num2+" is : " + calculator.calculate_power(num1, num2));
                System.out.println("\n");

            } else if (choice == 4) {
                System.out.print("Enter a number : ");
                num1 = scanner.nextDouble();
                System.out.println("Natural log of "+num1+" is : " + calculator.calculate_naturalLog(num1));
                System.out.println("\n");
            }
            else {
                System.out.println("Exiting....");
                return;
            }
        } while (true);
    }


    public double calculate_factorial(double num) {
        logger.info("[FACTORIAL] - " + num);
        double result = 1;
        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }



    public double calculate_power(double num1, double num2) {
        logger.info("[POWER - " + num1 + " RAISED TO] " + num2);
        double result = Math.pow(num1,num2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double calculate_sqroot(double num) {
        logger.info("[SQUARE ROOT] - " + num);
        double result = Math.sqrt(num);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }
    public double calculate_naturalLog(double num) {
        logger.info("[NATURAL LOG] - " + num);
        double res = 0;
        try {

            if (num < 0) {
                res = Double.NaN;
                throw new ArithmeticException("Undefined 0.0/0.0");
            }

            else {
                res = Math.log(num);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - NATURAL LOG] - negative numbers are given as input" + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + res);
        return res;
    }

}