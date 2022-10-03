package com.examples.arrayprograms;

// Refer
// https://techstudy.org/CLanguage/Write-C-program-to-find-reverse-of-an-array

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 0, 6, 7, 8, 9 };

		int i = 0;
		int j = arr1.length - 1;

		for (i = 0; i < j; i++, j--) {
			int temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
		}

		System.out.println("Reversed array");
		for (i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr1[i] + ", ");
		}

	}

}
