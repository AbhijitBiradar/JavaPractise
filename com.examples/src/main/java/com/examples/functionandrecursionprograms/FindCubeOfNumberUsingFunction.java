package com.examples.functionandrecursionprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-find-cube-of-a-number-using-function

public class FindCubeOfNumberUsingFunction {

	public static int getCube(int number) {
		return (number * number * number);
	}

	public static void main(String[] args) {
		System.out.println("Please enter a number:");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		System.out.println("Cube : " + getCube(number));
	}
}
