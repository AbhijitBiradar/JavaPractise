package com.examples.arrayprograms;

// Refer
// https://techstudy.org/CLanguage/C-program-to-count-number-of-each-element-in-an-array

public class CountNumberOfEachElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 8, 1, 5, 8, 6, 9, 9, 5 };
		int[] frequency = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > 0) {
				frequency[i] = count;
			}
		}

		System.out.println("Displaying frequency: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array value : " + arr[i] + " Frequency : " + frequency[i]);
		}
	}
}
