package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-count-total-number-of-notes-in-entered-amount

public class TotalNoOfNotesInAmount {
	public static void main(String[] args) {
		int note1, note2, note5, note10, note20, note50, note100, note500;
		note1 = note2 = note5 = note10 = note20 = note50 = note100 = note500 = 0;

		System.out.println("Please enter amount: ");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();

		if (amount >= 500) {
			note500 = amount / 500;
			amount = amount - (note500 * 500);
		}

		if (amount >= 100) {
			note100 = amount / 100;
			amount = amount - (note100 * 100);
		}

		if (amount >= 50) {
			note50 = amount / 50;
			amount = amount - (note50 * 50);
		}

		if (amount >= 20) {
			note20 = amount / 20;
			amount = amount - (note20 * 20);
		}

		if (amount >= 10) {
			note10 = amount / 10;
			amount = amount - (note10 * 10);
		}

		if (amount >= 5) {
			note5 = amount / 5;
			amount = amount - (note5 * 5);
		}

		if (amount >= 1) {
			note2 = amount / 2;
			amount = amount - (note2 * 2);
		}

		if (amount >= 1) {
			note1 = amount / 1;
			amount = amount - (note1 * 1);
		}

		// int note1, note2, note5, note10, note20, note50, note100, note500;
		System.out.println("Total Notes in given amount:");

		System.out.println("500 Notes: " + note500);
		System.out.println("100 Notes: " + note100);
		System.out.println("50 Notes: " + note50);
		System.out.println("20 Notes: " + note20);
		System.out.println("10 Notes: " + note10);
		System.out.println("5 Notes: " + note5);
		System.out.println("2 Notes: " + note2);
		System.out.println("1 Notes: " + note1);

	}
}
