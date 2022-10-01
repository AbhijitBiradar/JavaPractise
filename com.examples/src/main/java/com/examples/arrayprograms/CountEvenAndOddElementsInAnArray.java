package com.examples.arrayprograms;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-count-even-and-odd-elements-in-an-array

public class CountEvenAndOddElementsInAnArray {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, -1, -3, 8, 7, -5, 1 };
		int countEven = 0;
		int countOdd = 0;
		System.out.println("Count odd and even numbers in array");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}

		System.out.println("Total Odd Numbers: " + countOdd + " Total Even Numbers : " + countEven);
	}
}
