package com.examples.loopprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-print-multiplication-table-of-a-given-number

public class PrintMultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int number = scan.nextInt();

		System.out.println("Multiplication table:");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " ==> " + (number * i));
		}
	}
}
