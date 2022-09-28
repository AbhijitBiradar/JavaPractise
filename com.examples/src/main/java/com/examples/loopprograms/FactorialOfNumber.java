package com.examples.loopprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-find-factorial-of-any-number

public class FactorialOfNumber {
	public static void main(String[] args) {
		System.out.println("Please enter a number: ");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		int i = 1;
		int fact = 1;
		while (i <= number) {
			fact = fact * i;
			i++;
		}

		System.out.println("Factorial: " + fact);
	}
}
