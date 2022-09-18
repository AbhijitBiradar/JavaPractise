package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer this
// https://techstudy.org/cLanguage/C-program-to-find-the-largest-among-three-variables-using-nested-if

public class LargestNumberUsingNestedIf {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number!");
		int firstNumber = scan.nextInt();

		System.out.println("Please enter second number!");
		int secondNumber = scan.nextInt();

		System.out.println("Please enter third number!");
		int thirdNumber = scan.nextInt();

		// logic
		if (firstNumber > secondNumber) {
			if (firstNumber > thirdNumber) {
				System.out.println(firstNumber + " is largest number!");
			} else {
				System.out.println(thirdNumber + " is largest number");
			}
		} else if (secondNumber > thirdNumber) {
			System.out.println(secondNumber + " is largest number!");
		} else {
			System.out.println(thirdNumber + " is largest number!");
		}
	}
}
