package com.examples.arrayprograms;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-find-maximum-and-minimum-element-in-array

public class FindMaximumAndMinimumElementInArray {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, -1, -3, 8, 7, -5, 1 };

		int max = array1[0];
		int min = array1[0];

		for (int i = 0; i < array1.length; i++) {

			// check for max element
			if (array1[i] > max) {
				max = array1[i];
			}

			// check for min element
			if (array1[i] < min) {
				min = array1[i];
			}
		}

		System.out.println("Min: " + min + ", Max: " + max);
	}
}
