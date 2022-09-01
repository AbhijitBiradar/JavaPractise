package com.examples.basicprograms;

import java.util.Scanner;

// Reference
// https://techstudy.org/cLanguage/C-Program-to-Calculate-Area-of-Rectangle

public class CalculateAreaOfRectangle {

	public static void main(String[] args) {
		int length, breadth, area;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter length of rectangle: ");
		length = scan.nextInt();

		System.out.println("Please enter breadth of rectangle: ");
		breadth = scan.nextInt();

		area = length * breadth;

		System.out.println("Area of Rectangle: " + area);

		scan.close();

	}

}
