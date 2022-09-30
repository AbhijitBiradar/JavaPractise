package com.examples.functionandrecursionprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-print-even-or-odd-numbers-in-given-range-using-recursion

public class PrintEvenOrOddNumbersUsingRecursion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Lower limit:");
		int lowerLimit = scan.nextInt();

		System.out.println("Enter Upper limit:");
		int upperLimit = scan.nextInt();

		System.out.println("Even Numbers:\n");
		printevenodd(lowerLimit, upperLimit);
	}

	private static void printevenodd(int lowerLimit, int upperLimit) {
		if (lowerLimit > upperLimit) {
			return;
		} else {
			System.out.print(lowerLimit + " ");
			printevenodd(lowerLimit + 2, upperLimit);
		}
	}
}
