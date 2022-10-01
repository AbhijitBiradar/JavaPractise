package com.examples.arrayprograms;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-count-total-number-of-negative-elements-in-array

public class CountTotalNumberOfNegativeElementsInArray {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, -1, -3, 8, 7, -5, 1 };
		int count = 0;
		System.out.println("Printing Negative elements from array:");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] < 0) {
				count++;
			}
		}

		System.out.println("There are total : " + count + " negative elements in array!");
	}
}
