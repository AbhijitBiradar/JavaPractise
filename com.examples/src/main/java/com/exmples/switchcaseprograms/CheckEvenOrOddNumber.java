package com.exmples.switchcaseprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-check-even-or-odd-number-using-switch-case

public class CheckEvenOrOddNumber {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int number = scan.nextInt();

		switch (number % 2) {
		case 0:
			System.out.println("It's even number");
			break;

		case 1:
			System.out.println("It's odd number");
			break;
		}
	}
}
