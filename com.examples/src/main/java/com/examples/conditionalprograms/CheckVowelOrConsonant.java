package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-check-entered-character-vowel-or-consonant

public class CheckVowelOrConsonant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character!");
		char ch = scan.next().charAt(0);

		// a, e, i, o, u
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("It's Vowel!");
		} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("It's Consonant");
		}
	}
}
