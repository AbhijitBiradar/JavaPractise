package com.examples.basicprograms;

import java.util.Scanner;

public class convertFeetToMeter {

	public static void main(String[] args) {
		double meter, feet;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter value in Feet: ");
		feet = scan.nextFloat();

		meter = feet / 3.2808399;

		System.out.println("Values in Meter :" + meter);

	}

}
