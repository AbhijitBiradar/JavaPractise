package com.examples.basicprograms;

import java.util.Scanner;

// Reference
// https://techstudy.org/cLanguage/C-Program-to-Multiply-two-Floating-Point-Numbers

public class MultiplyTwoFloatingNumbers {

	public static void main(String[] args) {
		double firstNumber, secondNumber, total;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number");
		firstNumber = scan.nextDouble();

		System.out.println("Please enter second number");
		secondNumber = scan.nextDouble();

		total = firstNumber * secondNumber;

		System.out.println("Total : " + total);
	}
}
