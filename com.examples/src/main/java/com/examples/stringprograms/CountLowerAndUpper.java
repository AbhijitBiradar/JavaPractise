package com.examples.stringprograms;

// Refer
// https://techstudy.org/cLanguage/C-Program-to-Count-number-of-Lowercase-and-Uppercase-Letters
// https://www.geeksforgeeks.org/count-uppercase-lowercase-special-character-numeric-values/

public class CountLowerAndUpper {

	public static void main(String[] args) {
		String str = "#GeeKs01fOr@gEEks07";
		int upper = 0, lower = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			}

		}

		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
	}
}
