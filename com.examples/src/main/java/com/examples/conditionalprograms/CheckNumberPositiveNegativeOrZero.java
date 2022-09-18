package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-check-number-is-positive-negative-or-zero

public class CheckNumberPositiveNegativeOrZero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = scan.nextInt();

		if (number == 0) {
			System.out.println("Number is zero!");
		} else if (number > 0) {
			System.out.println("Number is positive");
		} else if (number < 0) {
			System.out.println("Number is negative!");
		}
	}
}
