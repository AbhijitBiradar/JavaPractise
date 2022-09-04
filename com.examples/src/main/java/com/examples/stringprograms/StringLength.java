package com.examples.stringprograms;

// Refer
// https://techstudy.org/cLanguage/C-program-to-find-string-length

public class StringLength {

	public static void main(String[] args) {
		// Method 1

		String str1 = "AbhijitBiradar";
		char[] charArray = str1.toCharArray();

		int i = 0;
		for (char ch : charArray) {
			i++;
		}

		System.out.println("String length: " + i);

		// Method 2
		String s1 = "javatpoint";
		System.out.println("string length is: " + s1.length());

	}

}
