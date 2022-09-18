package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-check-uppercase-or-lowercase-alphabets

public class CheckUppercaseOrLowercaseAlphabets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character:");
		char ch = scan.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("It's Lower case alphabet!");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("It's a Upper case alphabet!");
		} else {
			System.out.println("It's not a character!");
		}
	}
}
