package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-Program-to-Find-the-Largest-Number-Among-Three

public class FindLargestNumberAmongThree {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number");
		int firstNumber = scan.nextInt();

		System.out.println("Please enter second number");
		int secondNumber = scan.nextInt();

		System.out.println("Please enter third number");
		int thirdNumber = scan.nextInt();

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber + " number is largest");
		} else if (firstNumber < secondNumber && firstNumber > thirdNumber) {
			System.out.println(secondNumber + " number is largest");
		} else {
			System.out.println(thirdNumber + " number is largest");
		}
	}

}
