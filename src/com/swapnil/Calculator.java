package com.swapnil;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a, b;
        char ch;
        Scanner calci = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = calci.nextDouble();
        System.out.println("Enter the operation +,-,*,/,%");
        ch = calci.next().charAt(0);
        System.out.println("Enter the second number");
        b = calci.nextDouble();
        switch (ch) {
            case '+':
                System.out.println("Sum is " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction is " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication is " + (a * b));
                break;
            case '/':
                System.out.println("Divison is " + (a / b));
                break;
            case '%':
                System.out.println("Remainder on dividing first number by second is " + (a % b));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        calci.close();
    }
}
