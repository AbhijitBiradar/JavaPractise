package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-check-whether-a-character-is-alphabet-digit-or-special-character

public class CheckAlphabetDigitOrSpecialCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a character!");
		char ch = scan.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("It's character!");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("It's digit!");
		} else {
			System.out.println("It's special character!");
		}
	}
}
