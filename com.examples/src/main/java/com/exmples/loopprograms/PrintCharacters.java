package com.exmples.loopprograms;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-print-alphabets-from-a-to-z

public class PrintCharacters {
	public static void main(String[] args) {
		System.out.println("Printing alphabet from a to z in lowercase");

		char ch;
		for (ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(" " + ch);
		}

		System.out.println();

		System.out.println("Printing alphabet from A to Z in uppercase");
		for (ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(" " + ch);
		}
	}
}
