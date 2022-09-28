package com.examples.switchcaseprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-check-vowel-or-consonant-using-switch-case

public class CheckVowelOrConsonant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an alphabet:");
		char ch = scan.next().charAt(0);

		switch (ch) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		case 'A':
			System.out.println("vowel");
			break;
		case 'E':
			System.out.println("vowel");
			break;
		case 'I':
			System.out.println("vowel");
			break;
		case 'O':
			System.out.println("vowel");
			break;
		case 'U':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonant");
		}
	}
}
