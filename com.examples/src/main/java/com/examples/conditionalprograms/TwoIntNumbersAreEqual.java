package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-accept-two-integers-and-check-whether-they-are-equal-or-not

public class TwoIntNumbersAreEqual {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first Number!");
		int firstNumber = scan.nextInt();

		System.out.println("Please enter second Number!");
		int secondNumber = scan.nextInt();

		if (firstNumber == secondNumber) {
			System.out.println(firstNumber + " & " + secondNumber + " are equal");
		} else {
			System.out.println(firstNumber + " & " + secondNumber + " are not equal");
		}
	}
}
