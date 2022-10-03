package com.examples.arrayprograms;

// Refer
// https://techstudy.org/CLanguage/Write-C-program-to-put-even-and-odd-elements-of-array-in-two-separate-array

public class PutEvenAndOddElementsIntoSaparateArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 0, 6, 7, 8, 9 };
		int[] oddArray = new int[arr1.length];
		int[] evenArray = new int[arr1.length];

		int j = 0, k = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				evenArray[j] = arr1[i];
				i++;
				j++;
			} else {
				oddArray[k] = arr1[i];
				i++;
				k++;
			}
		}
		
		System.out.println("Odd Numbers:");
		for(int i=0; i<oddArray.length; i++) {
			System.out.print(oddArray[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("Even Numbers:");
		for(int i=0; i<evenArray.length; i++) {
			System.out.print(evenArray[i] + ", ");
		}

	}

}
