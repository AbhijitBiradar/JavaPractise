package com.examples.arrayprograms;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-find-sum-of-all-elements-of-an-array

public class SumOfAllElementsOfAnArray {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, -1, -3, 8, 7, -5, 1 };
		int sum = 0;
		System.out.println("sum of array elements");
		for (int i = 0; i < array1.length; i++) {
			sum = sum + i;
		}

		System.out.println("Array Sum: " + sum);
	}
}
