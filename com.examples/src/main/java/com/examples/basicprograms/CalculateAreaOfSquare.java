package com.examples.basicprograms;

import java.util.Scanner;

// REfer
// https://techstudy.org/cLanguage/C-Program-to-Calculate-Area-of-Square

public class CalculateAreaOfSquare {
	public static void main(String[] args) {
		int side, area;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for side: ");
		side = scan.nextInt();

		area = side * side;

		System.out.println("Area : " + area);

		scan.close();
	}
}
