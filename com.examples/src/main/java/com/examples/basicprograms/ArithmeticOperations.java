package com.examples.basicprograms;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int num1, num2;
		int sum, sub, mult, mod;
		float div;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number: ");
		num1 = scan.nextInt();

		System.out.println("Please enter second number: ");
		num2 = scan.nextInt();

		sum = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		mod = num1 % num2;
		div = num1 / num2;

		System.out.println("All Arithmetic Operation");
		System.out.println("Addition :" + sum);
		System.out.println("Substraction :" + sub);
		System.out.println("Multiplication :" + mult);
		System.out.println("Modulus :" + mod);
		System.out.println("Division :" + div);

	}

}
