package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-check-alphabets-using-conditional-operator

public class CheckAlphabetsUsingConditionalOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character");
		char ch = scan.next().charAt(0);

		System.out.println(((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? "Alphabet" : "Not Alphabet");
	}
}
