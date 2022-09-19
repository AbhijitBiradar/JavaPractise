package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-check-whether-a-triangle-can-be-formed-by-the-given-value-for-the-angles/

public class VerifyTriangleWithAngles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter angle 1: ");
		int angle1 = scan.nextInt();

		System.out.println("Please enter angle 2:");
		int angle2 = scan.nextInt();

		System.out.println("Please enter angle 3:");
		int angle3 = scan.nextInt();

		if ((angle1 + angle2 + angle3) == 180) {
			System.out.println("Valid Triangle!");
		} else {
			System.out.println("Not a Valid Triangle!");
		}
	}
}
