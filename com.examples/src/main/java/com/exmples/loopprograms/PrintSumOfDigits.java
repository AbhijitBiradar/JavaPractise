package com.exmples.loopprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-a-C-program-to-print-sum-of-digits-enter-by-user

public class PrintSumOfDigits {
	public static void main(String[] args) {
		System.out.println("Please enter a number:");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		int total = 0;
		for (total = 0; number > 0; number = number / 10) {
			total = total + (number % 10);
		}

		System.out.println("sum of digits: " + total);
	}
}
