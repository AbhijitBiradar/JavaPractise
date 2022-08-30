package com.examples.basicprograms;

import java.util.Scanner;

// Reference
// https://techstudy.org/cLanguage/C-Program-to-Add-Two-Numbers

public class AdditionOfTwoNumbers {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int total;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number: ");
		firstNumber = scan.nextInt();

		System.out.println("Please enter second number: ");
		secondNumber = scan.nextInt();

		total = firstNumber + secondNumber;

		System.out.println("Addition of two number : " + total);

	}
}
