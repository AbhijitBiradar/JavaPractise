package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-Program-to-Find-the-Largest-Number-using-Conditional-Operator

public class LargestNumberUsingConditionalOperator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number");
		int firstNumber = scan.nextInt();

		System.out.println("Please enter second number");
		int secondNumber = scan.nextInt();

		System.out.println("Please enter third number");
		int thirdNumber = scan.nextInt();

		int largest = (firstNumber > secondNumber) ? (firstNumber > thirdNumber ? firstNumber : thirdNumber)
				: (secondNumber > thirdNumber ? secondNumber : thirdNumber);
		
		System.out.println(largest + " is largest nunber");
		
		scan.close();
	}

}
