package com.exmples.loopprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-find-sum-of-even-numbers-between-1-to-n

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		System.out.println("Please enter a number: ");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		int sum = 0;
		for (int i = 2; i <= number; i += 2) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("Total: " + sum);
	}
}
