package com.examples.arrayprograms;

// Refer
// https://techstudy.org/CLanguage/Write-C-program-to-delete-all-duplicate-elements-from-an-array

public class DeleteAllDuplicateElementsFromAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 8, 1, 5, 8, 6, 9, 9, 5 };

		// Finding all duplicate elements in array
		int i = 0;
		int j = 0;
		int k = 0;
		int arrayLength = arr.length-1;
		for (i = 0; i < arrayLength; i++) { // i loop is used to traverse the array
			for (j = i + 1; j < arrayLength; j++) { // j loop is used to compare element
				// If any duplicate found */
				if (arr[i] == arr[j]) {
					// Delete the current duplicate element
					for (k = j; k < arrayLength; k++) { // k loop is used to delete or shift element
						arr[k] = arr[k + 1];
					}
					// Decrement size after removing duplicate element
					arrayLength--;
					// If shifting of elements occur then don't increment j
					j--;
				}
			}
		}

		System.out.println("\nArray elements after deleting duplicates : ");
		for (i = 0; i < arrayLength; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
