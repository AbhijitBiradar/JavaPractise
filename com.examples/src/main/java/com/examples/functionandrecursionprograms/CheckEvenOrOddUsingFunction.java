package com.examples.functionandrecursionprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-check-even-or-odd-using-functions

public class CheckEvenOrOddUsingFunction {
	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int number = scan.nextInt();

		if (isEven(number)) {
			System.out.println("It's Even Number");
		} else {
			System.out.println("It's Odd Number");
		}
	}
}
