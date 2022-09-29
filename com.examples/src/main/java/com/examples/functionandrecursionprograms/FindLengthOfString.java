package com.examples.functionandrecursionprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-Program-to-find-Length-of-the-String-by-passing-String

public class FindLengthOfString {

	public static int getStringLength(char[] charArray) {
		int length = 0;
		for (char ch : charArray) {
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		System.out.println("Please enter a string:");

		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		System.out.println("Length of string: " + getStringLength(str.toCharArray()));
	}
}
