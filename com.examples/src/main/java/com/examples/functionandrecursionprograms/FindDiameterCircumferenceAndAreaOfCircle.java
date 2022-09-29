package com.examples.functionandrecursionprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-find-diameter-circumference-and-area-of-circle-using-function

public class FindDiameterCircumferenceAndAreaOfCircle {
	public static double getArea(double radius) {
		return (3.14 * radius * radius); // PI = 3.14
	}

	public static double getCircumference(double radius) {
		return (2 * 3.14 * radius); // PI = 3.14
	}

	public static double getDiameter(double radius) {
		return (2 * radius);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a radius: ");
		double radius = scan.nextDouble();

		System.out.println("Area: " + getArea(radius));
		System.out.println("Circumference: " + getCircumference(radius));
		System.out.println("Diameter : " + getDiameter(radius));
	}
}
