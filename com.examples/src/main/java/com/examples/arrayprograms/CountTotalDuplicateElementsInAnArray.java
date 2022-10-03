package com.examples.arrayprograms;

// Refer
// https://techstudy.org/CLanguage/Write-C-program-count-total-duplicate-elements-in-an-array

public class CountTotalDuplicateElementsInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 8, 1, 5, 8, 6, 9, 9, 5 };

		int i = 0;
		int j = 0;
		int count = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				// If duplicate element found then increment count by 1
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}

		System.out.println("\nTotal number of duplicate elements found in array = " + count);
	}
}
