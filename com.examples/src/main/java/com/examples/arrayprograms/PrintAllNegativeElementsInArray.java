package com.examples.arrayprograms;

// Refer
// https://techstudy.org/cLanguage/Write-a-C-program-to-print-all-negative-elements-in-an-array

public class PrintAllNegativeElementsInArray {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, -1, -3, 8, 7, -5, 1 };

		System.out.println("Printing Negative elements from array:");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] < 0) {
				System.out.print(array1[i] + " ");
			}
		}
	}
}
