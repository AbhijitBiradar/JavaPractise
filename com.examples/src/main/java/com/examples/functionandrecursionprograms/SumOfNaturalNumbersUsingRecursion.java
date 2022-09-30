package com.examples.functionandrecursionprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-find-sum-of-natural-numbers-in-given-range-using-recursion

public class SumOfNaturalNumbersUsingRecursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter lower limit:");
		int start = scan.nextInt();

		System.out.println("Please enter upper limit:");
		int end = scan.nextInt();

		System.out.println("Sum : " + sumofnnumbers(start, end));
	}

	private static int sumofnnumbers(int start, int end) {
		if (start == end) {
			return start;
		} else {
			return start + sumofnnumbers(start + 1, end);
		}
	}

}
