package com.examples.arrayprograms;

// Refer
// https://techstudy.org/CLanguage/Write-C-program-to-merge-two-sorted-array

public class MergeTwoSortedArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 0, 6, 7, 8, 9 };

		int[] arr3 = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;
		for (k = 0; k < arr3.length; k++) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}

			if (arr1[i] > arr2[j]) {
				arr3[i] = arr2[j];
				j++;
				k++;
			}

			if (i >= arr1.length || j >= arr2.length) {
				break;
			}
		}

		while (i <= arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}

		while (j <= arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;

		}

		System.out.println("Merged elements: ");
		for (k = 0; k < arr3.length; k++) {
			System.out.print(arr3[k]);
		}
	}
}
