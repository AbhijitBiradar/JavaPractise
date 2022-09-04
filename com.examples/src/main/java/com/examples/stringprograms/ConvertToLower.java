package com.examples.stringprograms;

public class ConvertToLower {

	public static void main(String[] args) {

		// Method 1
		String str1 = "JAVA PROGRAMMING";
		System.out.println(str1.toLowerCase());

		// Method 2
		String input = "JAVA IS BEST";

		char str[] = input.toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'A' && str[i] <= 'Z') {
				str[i] = (char) ((int) str[i] + 32);
			}
		}
		System.out.println(str);
	}
}
