package com.examples.basicprograms;

import java.util.Scanner;

// Reference
// https://techstudy.org/cLanguage/C-Program-to-Swap-Values-of-Two-Variables

public class SwapValuesOfTwoVariables {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int temp;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number: ");
		firstNumber = scan.nextInt();

		System.out.println("Please enter second number: ");
		secondNumber = scan.nextInt();

		System.out.println("Values before swapping");
		System.out.println("firstNumber : " + firstNumber);
		System.out.println("secondNumber: " + secondNumber);

		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;

		System.out.println("Values after swapping");
		System.out.println("firstNumber : " + firstNumber);
		System.out.println("secondNumber: " + secondNumber);
	}

}
