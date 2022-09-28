package com.examples.switchcaseprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-create-calculator-using-switch-Statement

public class SimpleCalculator {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the operation (+, -, *,):");
		char operator = scan.next().charAt(0);

		System.out.println("Enter first operand: ");
		double firstNumber = scan.nextDouble();

		System.out.println("Enter second operand: ");
		double secondNumber = scan.nextDouble();

		switch (operator) {
		case '+':
			System.out.println(firstNumber + secondNumber);
			break;

		case '-':
			System.out.println(firstNumber - secondNumber);
			break;

		case '*':
			System.out.println(firstNumber * secondNumber);
			break;

		case '/':
			System.out.println(firstNumber / secondNumber);
			break;

		default:
			System.out.println("Error! please enter correct operator");
		}
	}
}
