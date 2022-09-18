package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-Program-to-check-whether-an-integer-entered-by-the-user-is-odd-or-even

public class OddEvenNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int number = scan.nextInt();

		if (number % 2 == 0) {
			System.out.println("Even Number!");
		} else {
			System.out.println("Odd Number!");
		}
		scan.close();
	}
}
