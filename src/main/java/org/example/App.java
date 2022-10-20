package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number A and and B to find out the result, or the word \"Stop\" to complete the execution:");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("Choose operation:");
            System.out.println("1. +  " +
                    "2. -  " +
                    "3. *  " +
                    "4. /  ");
            int operationNumber = scanner.nextInt();
            String stopCondition = scanner.nextLine();
            if (stopCondition.equals("Stop")){
                break;
            }

            switch (operationNumber) {
                case 1:
                    System.out.println(a + " + " + b + " = " + calculator.plus(a, b));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + calculator.minus(a, b));
                    break;
                case 3:
                    System.out.println(a + " * " + b + " = " + calculator.multiplication(a, b));
                    break;
                case 4:
                    System.out.println(a + " / " + b + " = " + calculator.division(a, b));
                    break;
            }
        }
    }
}
