package com.exmples.loopprograms;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-print-ASCII-values-of-all-characters

public class PrintASCIIValues {
	public static void main(String[] args) {
		for (int i = 0; i <= 255; i++) {
			System.out.println(i + " ==> " + (char) i);
		}
	}
}
