package com.examples.basicprograms;

import java.util.Scanner;

// REfer
// https://techstudy.org/cLanguage/C-Program-to-Calculate-Area-of-Circle
public class CalculateAreaOfCircle {
	public static void main(String[] args) {
		double radius, area;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter radius: ");
		radius=scan.nextDouble();
		
		area=Math.PI * radius * radius;
		
		System.out.println("Area : " + area);
		
		scan.close();
	}
}
