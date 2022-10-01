package com.examples.arrayprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-a-C-program-to-read-and-print-elements-of-array

public class ReadAndPrintElementsOfArray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter array size:");
		int size = scan.nextInt();

		int[] array1 = new int[size];

		System.out.println("Please enter array element:");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Enter " + i + " Element: ");
			array1[i] = scan.nextInt();
		}

		System.out.println("Printing array elements: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] + " ");
		}
	}
}
