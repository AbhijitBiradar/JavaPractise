package com.examples.loopprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-a-C-program-to-print-all-natural-numbers-in-reverse-order

public class PrintNaturalNumbersInReverseOrder {
	public static void main(String[] args) {
		System.out.println("Please enter a number: ");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		System.out.println("Printing natural number in reverse order:");
		for (int i = number; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
}
